package com.example.Book_my_show.Controllers;

import com.example.Book_my_show.Dtos.Request.UserRequestDto;
import com.example.Book_my_show.Services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserRequestDto userEntryDto){
        try {
           String response = userService.addUser(userEntryDto);

           return new ResponseEntity<>(response, HttpStatus.CREATED);
        }
        catch (Exception e){

            String result = "User could not be added";
            return new ResponseEntity<>(result,HttpStatus.BAD_REQUEST);
        }

    }
}
