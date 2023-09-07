package com.example.Book_my_show.Services;

import com.example.Book_my_show.Dtos.Request.TicketRequestDto;
import com.example.Book_my_show.Models.Ticket;

import java.util.List;

public interface TicketService {
    String addTicket(TicketRequestDto ticketRequestDto) throws Exception;
    String cancelTicket(int ticketId);
    Ticket getTicket(int ticketId);
    List<Ticket> getAllTickets();

}
