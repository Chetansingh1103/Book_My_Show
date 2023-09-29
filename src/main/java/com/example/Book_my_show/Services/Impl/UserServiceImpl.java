package com.example.Book_my_show.Services.Impl;

import com.example.Book_my_show.Converters.UserRequestConvertor;
import com.example.Book_my_show.Converters.UserResponseConverter;
import com.example.Book_my_show.Dtos.Request.UserRequestDto;
import com.example.Book_my_show.Dtos.Response.UserResponseDto;
import com.example.Book_my_show.Models.User;
import com.example.Book_my_show.Repositories.UserRepository;
import com.example.Book_my_show.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(UserRequestDto userRequestDto){
//        if(userRequestDto.getName() == null || userRequestDto.getAge() == 0 || userRequestDto.getAddress() == null || userRequestDto.getEmail() == null || userRequestDto.getMobNo() == null){
//            throw new Exception();
//        }
        User user = UserRequestConvertor.convertDtoTOEntity(userRequestDto);

        userRepository.save(user);

        return "user added successfully";
    }

    @Override
    public UserResponseDto getUserByUserId(int userId) {
        User user = userRepository.getOne(userId);

        return UserResponseConverter.convertEntityToDto(user);
    }

    @Override
    public User getUserByMobileNumber(String MobileNumber) {
        return null;
    }

    @Override
    public String updateUser(UserRequestDto userRequestDto, int userId) {
        return null;
    }

    @Override
    public String deleteUserByUserId(int userId) {
        return null;
    }

    @Override
    public String deleteUserByMobileNumber(String mobileNumber) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
