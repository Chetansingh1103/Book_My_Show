package com.example.Book_my_show.Services.Impl;

import com.example.Book_my_show.Converters.MovieRequestConvertor;
import com.example.Book_my_show.Converters.MovieResponseConvertor;
import com.example.Book_my_show.Dtos.Request.MovieRequestDto;
import com.example.Book_my_show.Dtos.Response.MovieResponseDto;
import com.example.Book_my_show.Models.Movie;
import com.example.Book_my_show.Repositories.MovieRepository;
import com.example.Book_my_show.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    MovieRepository movieRepository;
    public String addMovie(MovieRequestDto movieRequestDto){
        Movie movie = MovieRequestConvertor.convertDtoTOEntity(movieRequestDto);
        movieRepository.save(movie);

        return "movie added successfully";
    }

    @Override
    public String getMovieNameByMaxShow() {

        return movieRepository.getMovieNameByMaximumShow();
    }

    @Override
    public Movie getMovieByMovieName(String movieName) {
        return null;
    }

    @Override
    public List<MovieResponseDto> getAllMovies() {
        List<Movie> movies = movieRepository.getAllMovies();
        List<MovieResponseDto> movieResponseDtoList = new ArrayList<>();

        for(Movie m : movies){
            MovieResponseDto movieResponseDto = MovieResponseConvertor.convertEntityToDto(m);
            movieResponseDtoList.add(movieResponseDto);
        }

        return movieResponseDtoList;
    }

    @Override
    public String removeMovieByMovieId(int movieId) {
        return null;
    }

    @Override
    public String removeMovieByMovieName(String movieName) {
        return null;
    }

    @Override
    public String updateMovieDetailsByMovieName(MovieRequestDto movieRequestDto, String movieName) {
        return null;
    }

    @Override
    public String updateMovieDetailsByMovieId(MovieRequestDto movieRequestDto, int movieId) {
        return null;
    }

    @Override
    public long getTotalCollectionOfMovie(String movieName) {
        return 0;
    }
}
