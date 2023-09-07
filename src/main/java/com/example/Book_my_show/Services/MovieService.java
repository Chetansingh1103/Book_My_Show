package com.example.Book_my_show.Services;

import com.example.Book_my_show.Dtos.Request.MovieRequestDto;
import com.example.Book_my_show.Dtos.Response.MovieResponseDto;
import com.example.Book_my_show.Models.Movie;

import java.util.List;

public interface MovieService {
    String addMovie(MovieRequestDto movieRequestDto);
    String getMovieNameByMaxShow();
    Movie getMovieByMovieName(String movieName);
    List<MovieResponseDto> getAllMovies();
    String removeMovieByMovieId(int movieId);
    String removeMovieByMovieName(String movieName);
    String updateMovieDetailsByMovieName(MovieRequestDto movieRequestDto, String movieName);
    String updateMovieDetailsByMovieId(MovieRequestDto movieRequestDto, int movieId);
    long getTotalCollectionOfMovie(String movieName);
}
