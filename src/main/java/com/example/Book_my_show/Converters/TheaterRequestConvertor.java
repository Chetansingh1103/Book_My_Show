package com.example.Book_my_show.Converters;

import com.example.Book_my_show.Dtos.Request.TheaterRequestDto;
import com.example.Book_my_show.Models.Theater;

public class TheaterRequestConvertor {
    public static Theater convertDtoToEntity(TheaterRequestDto theaterRequestDto){
        return Theater.builder()
                .name(theaterRequestDto.getName())
                .location(theaterRequestDto.getLocation())
                .build();
    }
}
