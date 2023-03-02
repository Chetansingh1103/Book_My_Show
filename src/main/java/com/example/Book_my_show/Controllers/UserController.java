package com.example.Book_my_show.Controllers;

import com.example.Book_my_show.Dtos.Request.UserRequestDto;
import com.example.Book_my_show.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody UserRequestDto userRequestDto){
        try {
           String response = userService.addUser(userRequestDto);

           return new ResponseEntity<>(response, HttpStatus.CREATED);
        }
        catch (Exception e){

            String result = "User could not be added";
            return new ResponseEntity<>(result,HttpStatus.BAD_REQUEST);
        }

    }
}
