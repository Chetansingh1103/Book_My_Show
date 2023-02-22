package com.example.Book_my_show.Services;

import com.example.Book_my_show.Dtos.EntryDtos.UserEntryDto;
import com.example.Book_my_show.Models.User;
import com.example.Book_my_show.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto){

        // creating user entity and copying the values taken by dto from client side to the user database


//        User user = new User();
//        user.setAge(userRequestDto.getAge());
//        user.setName(userRequestDto.getName());
//        user.setEmail(userRequestDto.getEmail());
//        user.setMobNo(userRequestDto.getMobNo());
//        user.setAddress(userRequestDto.getAddress());


        // here we don't need to use setters instead we are using builder which is time efficient internally

        User user = User.builder()
                .age(userEntryDto.getAge())
                .name(userEntryDto.getName())
                .address(userEntryDto.getAddress())
                .email(userEntryDto.getEmail())
                .mobNo(userEntryDto.getMobNo())
                .build();

        userRepository.save(user);

        return "User has been added";
    }
}
