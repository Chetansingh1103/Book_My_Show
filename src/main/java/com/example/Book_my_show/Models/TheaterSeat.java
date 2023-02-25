package com.example.Book_my_show.Models;

import com.example.Book_my_show.Enums.SeatType;
import jakarta.persistence.*;
import lombok.*;

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
    @Column(unique = true)
    private String seatNo;
    private SeatType seatType;
    @ManyToOne
    @JoinColumn(referencedColumnName = "name")
    private Theater theater;
}
