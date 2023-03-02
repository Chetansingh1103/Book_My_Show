package com.example.Book_my_show.Controllers;

import com.example.Book_my_show.Dtos.Request.MovieRequestDto;
import com.example.Book_my_show.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieService movieService;
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
}
