package com.example.Book_my_show.Dtos.Request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserRequestDto {
    private String name;
    private int age;
    private String email;
    private String mobNo;
    private String address;
}
