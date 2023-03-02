package com.example.Book_my_show.Services;

import com.example.Book_my_show.Converters.UserRequestConvertor;
import com.example.Book_my_show.Dtos.Request.UserRequestDto;
import com.example.Book_my_show.Models.User;
import com.example.Book_my_show.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
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
}
