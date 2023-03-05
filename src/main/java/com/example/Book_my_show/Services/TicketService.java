package com.example.Book_my_show.Services;

import com.example.Book_my_show.Dtos.Request.TicketRequestDto;

public interface TicketService {
    String addTicket(TicketRequestDto ticketRequestDto) throws Exception;
}
