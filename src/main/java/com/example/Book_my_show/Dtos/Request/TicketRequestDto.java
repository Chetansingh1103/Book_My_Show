package com.example.Book_my_show.Dtos.Request;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TicketRequestDto {
    private int showId;
    private List<String> requestedSeats = new ArrayList<>();
    private int userId;
}
