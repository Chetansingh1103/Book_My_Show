package com.example.Book_my_show.Services;

import com.example.Book_my_show.Dtos.Request.UserRequestDto;
import com.example.Book_my_show.Models.User;

import java.util.List;

public interface UserService {
    String addUser(UserRequestDto userRequestDto);
    User getUserByUserId(int userId);
    User getUserByMobileNumber(String mobileNumber);
    String updateUser(UserRequestDto userRequestDto,int userId);
    String deleteUserByUserId(int userId);
    String deleteUserByMobileNumber(String mobileNumber);
    List<User> getAllUsers();
}
