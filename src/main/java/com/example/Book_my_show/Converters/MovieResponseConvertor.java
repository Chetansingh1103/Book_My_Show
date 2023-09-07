package com.example.Book_my_show.Converters;

import com.example.Book_my_show.Dtos.Response.MovieResponseDto;
import com.example.Book_my_show.Models.Movie;

public class MovieResponseConvertor {
    public static MovieResponseDto convertEntityToDto(Movie movie){

        return MovieResponseDto.builder()
                .movieName(movie.getMovieName())
                .duration(movie.getDuration())
                .genre(movie.getGenre())
                .rating(movie.getRating())
                .language(movie.getLanguage())
                .build();
    }
}
