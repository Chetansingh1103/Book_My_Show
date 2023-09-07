package com.example.Book_my_show.Dtos.Response;

import com.example.Book_my_show.Enums.Genre;
import com.example.Book_my_show.Enums.Language;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MovieResponseDto {
    private String movieName;
    private double rating;
    private double duration;
    private Language language;
    private Genre genre;
}
