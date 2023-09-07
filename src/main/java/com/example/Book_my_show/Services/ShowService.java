package com.example.Book_my_show.Services;

import com.example.Book_my_show.Dtos.Request.ShowRequestDto;
import com.example.Book_my_show.Models.Show;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface ShowService {
    String addShow(ShowRequestDto showRequestDto);
    String cancelShow(int showId);
    Show getShow(int showId);
    LocalTime getShowTime(String theaterName, String movieName);
    List<Show> getAllShowsByShowDate(LocalDate localDate);
    List<Show> getAllShowsAtLocation(String location);
    List<Show> getAllShowsByShowDateAndLocation(String location, LocalDate localDate);
    List<Show> getALlShowsByMovieNameAndLocation(String location, String movieName);

}
