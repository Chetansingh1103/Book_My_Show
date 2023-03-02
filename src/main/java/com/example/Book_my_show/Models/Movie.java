package com.example.Book_my_show.Models;

import com.example.Book_my_show.Enums.Genre;
import com.example.Book_my_show.Enums.Language;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(unique = true,nullable = false)
    private String movieName;
    private double rating;
    private double duration;
    @Enumerated(value = EnumType.STRING)
    private Language language;
    @Enumerated(value = EnumType.STRING)
    private Genre genre;
    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL)
    private List<Show> showList = new ArrayList<>();
}
