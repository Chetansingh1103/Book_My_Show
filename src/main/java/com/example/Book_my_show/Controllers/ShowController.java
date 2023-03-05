package com.example.Book_my_show.Controllers;

import com.example.Book_my_show.Dtos.Request.ShowRequestDto;
import com.example.Book_my_show.Services.Impl.ShowServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class ShowController {
    @Autowired
    ShowServiceImpl showService;
    @PostMapping("/add")
    public ResponseEntity<String> addShow(@RequestBody ShowRequestDto showRequestDto){
        try {
            String response = showService.addShow(showRequestDto);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }
        catch (Exception e){
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
