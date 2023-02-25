package com.example.Book_my_show.Converters;

import com.example.Book_my_show.Dtos.Request.MovieRequestDto;
import com.example.Book_my_show.Models.Movie;

public class MovieRequestConvertor {
    public static Movie convertDtoTOEntity(MovieRequestDto movieRequestDto){

        return Movie.builder()
                .movieName(movieRequestDto.getMovieName())
                .duration(movieRequestDto.getDuration())
                .genre(movieRequestDto.getGenre())
                .rating(movieRequestDto.getRating())
                .language(movieRequestDto.getLanguage())
                .build();
    }
}
