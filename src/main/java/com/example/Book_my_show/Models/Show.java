package com.example.Book_my_show.Models;

import com.example.Book_my_show.Enums.ShowType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shows")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate showDate;
    private LocalTime showTime;
    @Enumerated(value = EnumType.STRING)
    private ShowType showType;
    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    private List<Ticket> ticketList = new ArrayList<>();
    @ManyToOne
    @JoinColumn
    private Theater theater;
    @OneToMany(mappedBy = "show",cascade = CascadeType.ALL)
    private List<ShowSeat> showSeatList = new ArrayList<>();
    @ManyToOne
    @JoinColumn
    private Movie movie;
}
