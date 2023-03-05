package com.example.Book_my_show.Services.Impl;

import com.example.Book_my_show.Converters.ShowRequestConvertor;
import com.example.Book_my_show.Dtos.Request.ShowRequestDto;
import com.example.Book_my_show.Enums.SeatType;
import com.example.Book_my_show.Models.*;
import com.example.Book_my_show.Repositories.MovieRepository;
import com.example.Book_my_show.Repositories.ShowRepository;
import com.example.Book_my_show.Repositories.TheaterRepository;
import com.example.Book_my_show.Services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {
    @Autowired
    ShowRepository showRepository;
    @Autowired
    MovieRepository movieRepository;
    @Autowired
    TheaterRepository theaterRepository;


    public String addShow(ShowRequestDto showRequestDto){
        Show show = ShowRequestConvertor.convertDtoToEntity(showRequestDto);

        int movieId = showRequestDto.getMovieId();
        int theaterId = showRequestDto.getTheaterId();

        Movie movie = movieRepository.findById(movieId).get();

        Theater theater = theaterRepository.findById(theaterId).get();


        // setting the attribute of foreign key
        show.setMovie(movie);
        show.setTheater(theater);

        // goal is to create showSeat
        List<ShowSeat> showSeatList = createShowSeats(showRequestDto,show);

        show.setShowSeatList(showSeatList);

        // now we also need to update the parent entities

        show = showRepository.save(show);

        movie.getShowList().add(show);
        theater.getShowList().add(show);

        movieRepository.save(movie);
        theaterRepository.save(theater);

        return "The show has been added successfully";

    }

    private List<ShowSeat> createShowSeats(ShowRequestDto showRequestDto, Show show){

        // now the goal is to create the showSeat
        // we need to set its attributes

        Theater theater = show.getTheater();

        List<TheaterSeat> theaterSeatList = theater.getTheaterSeatList();

        List<ShowSeat> showSeatList = new ArrayList<>();

        for(TheaterSeat theaterSeat : theaterSeatList){

            ShowSeat showSeat = new ShowSeat();

            showSeat.setSeatNo(theaterSeat.getSeatNo());
            showSeat.setSeatType(theaterSeat.getSeatType());

            if(theaterSeat.getSeatType().equals(SeatType.CLASSIC)){
                showSeat.setPrice(showRequestDto.getClassicSeatPrice());
            }
            else{
                showSeat.setPrice(showRequestDto.getPremiumSeatPrice());
            }
            showSeat.setBooked(false);
            showSeat.setShow(show);

            showSeatList.add(showSeat);

        }

        return showSeatList;

    }
}
