package com.example.Book_my_show.Converters;

import com.example.Book_my_show.Dtos.Response.UserResponseDto;
import com.example.Book_my_show.Models.User;

public class UserResponseConverter {
    public static UserResponseDto convertEntityToDto(User user){
        return UserResponseDto.builder()
                .name(user.getName())
                .age(user.getAge())
                .email(user.getEmail())
                .mobNo(user.getMobNo())
                .address(user.getAddress())
                .build();
    }
}
