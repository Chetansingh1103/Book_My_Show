package com.example.Book_my_show.Controllers;

import com.example.Book_my_show.Dtos.EntryDtos.UserEntryDto;
import com.example.Book_my_show.Services.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody UserEntryDto userEntryDto){
        return userService.addUser(userEntryDto);
    }
}
