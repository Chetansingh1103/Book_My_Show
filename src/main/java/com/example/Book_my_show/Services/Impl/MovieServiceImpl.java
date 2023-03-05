package com.example.Book_my_show.Services.Impl;

import com.example.Book_my_show.Converters.MovieRequestConvertor;
import com.example.Book_my_show.Dtos.Request.MovieRequestDto;
import com.example.Book_my_show.Models.Movie;
import com.example.Book_my_show.Repositories.MovieRepository;
import com.example.Book_my_show.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;
    public String addMovie(MovieRequestDto movieRequestDto){
        Movie movie = MovieRequestConvertor.convertDtoTOEntity(movieRequestDto);
        movieRepository.save(movie);

        return "movie added successfully";
    }
}
