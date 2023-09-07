package com.example.Book_my_show.Controllers;

import com.example.Book_my_show.Dtos.Request.UserRequestDto;
import com.example.Book_my_show.Dtos.Response.UserResponseDto;
import com.example.Book_my_show.Services.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
//@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UserController {

    @Autowired
    UserServiceImpl userService;

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
    @GetMapping("/get_by_id")
    public ResponseEntity<UserResponseDto> getUserById(@RequestParam("id") int userId){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/get_by_mobileNo")
    public ResponseEntity<UserResponseDto> getUserByMobileNumber(@RequestParam("mobileNo") String mobileNumber){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
