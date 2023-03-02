package com.example.Book_my_show.Dtos.Request;

import com.example.Book_my_show.Enums.Genre;
import com.example.Book_my_show.Enums.Language;
import lombok.Data;

@Data
public class MovieRequestDto {
    private String movieName;
    private double rating;
    private double duration;
    private Language language;
    private Genre genre;
}
