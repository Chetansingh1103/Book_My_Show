package com.example.Book_my_show.Services;

import com.example.Book_my_show.Dtos.Request.TheaterRequestDto;
import com.example.Book_my_show.Models.Theater;

import java.util.List;

public interface TheaterService {
    String addTheater(TheaterRequestDto theaterRequestDto) throws Exception;
    Theater getTheaterByTheaterId(int TheaterId);
    Theater getTheaterByNameAndLocation(String name, String location);
    String rebuiltTheater(int theaterId, TheaterRequestDto theaterRequestDto);
    String demolishTheaterByTheaterId(int theaterId);
    String demolishTheaterByNameAndLocation(String name, String location);
    List<Theater> getAllTheaters();
    List<Theater> getAllTheatersAtLocation(String location);
    List<Theater> getAllTheaterByName(String name);
}
