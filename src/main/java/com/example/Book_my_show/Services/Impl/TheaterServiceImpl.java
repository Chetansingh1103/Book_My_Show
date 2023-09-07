package com.example.Book_my_show.Services.Impl;

import com.example.Book_my_show.Converters.TheaterRequestConvertor;
import com.example.Book_my_show.Dtos.Request.TheaterRequestDto;
import com.example.Book_my_show.Enums.SeatType;
import com.example.Book_my_show.Models.Theater;
import com.example.Book_my_show.Models.TheaterSeat;
import com.example.Book_my_show.Repositories.TheaterRepository;
import com.example.Book_my_show.Repositories.TheaterSeatRepository;
import com.example.Book_my_show.Services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterServiceImpl implements TheaterService {
    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    TheaterSeatRepository theaterSeatRepository;

    public String addTheater(TheaterRequestDto theaterRequestDto) throws Exception{

        // Do some validation ??
        if(theaterRequestDto.getName() == null || theaterRequestDto.getLocation() == null){
            throw new Exception("Name and location should be valid");
        }

        Theater theater = TheaterRequestConvertor.convertDtoToEntity(theaterRequestDto);

        List<TheaterSeat> theaterSeatList = createTheaterSeats(theaterRequestDto,theater);

        theater.setTheaterSeatList(theaterSeatList);

        theaterRepository.save(theater);

        return "theater has been added";
    }

    @Override
    public Theater getTheaterByTheaterId(int TheaterId) {
        return null;
    }

    @Override
    public Theater getTheaterByNameAndLocation(String name, String location) {
        return null;
    }

    @Override
    public String rebuiltTheater(int theaterId, TheaterRequestDto theaterRequestDto) {
        return null;
    }

    @Override
    public String demolishTheaterByTheaterId(int theaterId) {
        return null;
    }

    @Override
    public String demolishTheaterByNameAndLocation(String name, String location) {
        return null;
    }

    @Override
    public List<Theater> getAllTheaters() {
        return null;
    }

    @Override
    public List<Theater> getAllTheatersAtLocation(String location) {
        return null;
    }

    @Override
    public List<Theater> getAllTheaterByName(String name) {
        return null;
    }

    public List<TheaterSeat> createTheaterSeats(TheaterRequestDto theaterRequestDto,Theater theater){
        int noClassicSeats = theaterRequestDto.getClassicSeatsCount();
        int noPremiumSeats = theaterRequestDto.getPremiumSeatsCount();

        List<TheaterSeat> theaterSeatList = new ArrayList<>();

        for(int count = 1; count <= noClassicSeats; count++){

            // we need to make a new TheaterSeatEntity

            TheaterSeat theaterSeat = TheaterSeat.builder()
                    .seatType(SeatType.CLASSIC)
                    .seatNo(count + "C")
                    .theater(theater)
                    .build();

            theaterSeatList.add(theaterSeat);
        }

        for(int count = 1; count <= noPremiumSeats; count++){

            TheaterSeat theaterSeat = TheaterSeat.builder()
                    .seatType(SeatType.PREMIUM)
                    .seatNo(count + "P")
                    .theater(theater)
                    .build();

            theaterSeatList.add(theaterSeat);
        }

        //  no need to set seats because if we save the parent then child will be saved --> theaterSeatRepository.saveAll(theaterSeatList);

        return theaterSeatList;
    }
}
