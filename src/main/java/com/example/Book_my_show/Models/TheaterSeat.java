package com.example.Book_my_show.Models;

import com.example.Book_my_show.Enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "TheaterSeats")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TheaterSeat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seatNo;
    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;
    @ManyToOne
    @JoinColumn
    private Theater theater;
}
