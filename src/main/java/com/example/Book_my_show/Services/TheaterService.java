package com.example.Book_my_show.Services;

import com.example.Book_my_show.Dtos.Request.TheaterRequestDto;

public interface TheaterService {
    String addTheater(TheaterRequestDto theaterRequestDto) throws Exception;
}
