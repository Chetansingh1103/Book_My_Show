package com.example.Book_my_show.Services;

import com.example.Book_my_show.Dtos.Request.UserRequestDto;
import com.example.Book_my_show.Models.User;

public interface UserService {
    String addUser(UserRequestDto userRequestDto);
    User getUserById(int userId);
    User getUserByMobileNumber(String MobileNumber);
}
