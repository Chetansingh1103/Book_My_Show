package com.example.Book_my_show.Controllers;

import com.example.Book_my_show.Dtos.Request.TheaterRequestDto;
import com.example.Book_my_show.Dtos.Response.TheaterResponseDto;
import com.example.Book_my_show.Services.TheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
public class TheaterController {
    @Autowired
    TheaterService theaterService;
    @PostMapping("/addTheater")
    public ResponseEntity<String> addTheater(@RequestBody TheaterRequestDto theaterRequestDto){
        try {
            String response = theaterService.addTheater(theaterRequestDto);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }
        catch (Exception e){
            String response = "theater could not be added";
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}
