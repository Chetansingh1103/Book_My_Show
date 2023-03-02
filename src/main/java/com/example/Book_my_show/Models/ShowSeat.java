package com.example.Book_my_show.Models;

import com.example.Book_my_show.Enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "showSeats")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ShowSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private boolean isBooked;
    private int price;
    private String seatNo;
    private LocalDateTime bookedAt;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
    @ManyToOne
    @JoinColumn
    private Show show;
}
