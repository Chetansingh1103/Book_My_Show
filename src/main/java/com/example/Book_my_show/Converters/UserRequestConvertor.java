package com.example.Book_my_show.Converters;

import com.example.Book_my_show.Dtos.Request.UserRequestDto;
import com.example.Book_my_show.Models.User;

public class UserRequestConvertor {

    // static is kept to avoid calling it via objects/instances
    public static User convertDtoTOEntity(UserRequestDto userRequestDto){

        return User.builder()
                .age(userRequestDto.getAge())
                .name(userRequestDto.getName())
                .address(userRequestDto.getAddress())
                .mobNo(userRequestDto.getMobNo())
                .email(userRequestDto.getEmail())
                .build();
    }
}
