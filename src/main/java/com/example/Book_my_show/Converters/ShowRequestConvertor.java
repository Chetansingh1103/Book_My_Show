package com.example.Book_my_show.Converters;

import com.example.Book_my_show.Dtos.Request.ShowRequestDto;
import com.example.Book_my_show.Dtos.Request.TheaterRequestDto;
import com.example.Book_my_show.Models.Show;
import com.example.Book_my_show.Models.Theater;

public class ShowRequestConvertor {
    public static Show convertDtoToEntity(ShowRequestDto showRequestDto){
        return Show.builder()
                .showDate(showRequestDto.getLocalDate())
                .showTime(showRequestDto.getLocalTime())
                .showType(showRequestDto.getShowType())
                .build();
    }
}
