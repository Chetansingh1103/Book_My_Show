package com.example.Book_my_show.Converters;

import com.example.Book_my_show.Dtos.Request.TheaterRequestDto;
import com.example.Book_my_show.Dtos.Request.TicketRequestDto;
import com.example.Book_my_show.Models.Theater;
import com.example.Book_my_show.Models.Ticket;

public class TicketRequestConvertor {
    public static Ticket convertDtoToEntity(TicketRequestDto ticketRequestDto){
        return new Ticket();
    }
}
