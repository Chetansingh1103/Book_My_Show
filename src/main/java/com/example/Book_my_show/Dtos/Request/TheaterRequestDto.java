package com.example.Book_my_show.Dtos.Request;

import lombok.Data;

@Data
public class TheaterRequestDto {
    private String name;
    private String location;
    private  int classicSeatsCount;
    private int premiumSeatsCount;

}
