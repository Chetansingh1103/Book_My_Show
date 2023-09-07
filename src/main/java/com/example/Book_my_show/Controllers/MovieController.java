package com.example.Book_my_show.Controllers;

import com.example.Book_my_show.Dtos.Request.MovieRequestDto;
import com.example.Book_my_show.Dtos.Response.MovieResponseDto;
import com.example.Book_my_show.Services.Impl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieServiceImpl movieService;
    @PostMapping("/add")
    public ResponseEntity<String> addMovie(@RequestBody MovieRequestDto movieRequestDto){
        try {
            String result = movieService.addMovie(movieRequestDto);
            return new ResponseEntity<>(result, HttpStatus.CREATED);
        }
        catch (Exception e){
            String result = "movie could not be added";
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/get_movie_by_max_show")
    public ResponseEntity<String> getMovieNameByMaxShow() {  // getting name of movie whose shows are maximum
        try {
            String result = movieService.getMovieNameByMaxShow();
            return new ResponseEntity<>(result,HttpStatus.FOUND);
        }
        catch (Exception e){
            String result = "movie could not be found";
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
    }
    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @GetMapping("/get_all_movies")
    public ResponseEntity<List<MovieResponseDto>> getAllMovies() {
        try {
            List<MovieResponseDto> result = movieService.getAllMovies();
            return new ResponseEntity<>(result,HttpStatus.FOUND);
        }
        catch (Exception e){
            List<MovieResponseDto> result = new ArrayList<>();
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
    }
}
