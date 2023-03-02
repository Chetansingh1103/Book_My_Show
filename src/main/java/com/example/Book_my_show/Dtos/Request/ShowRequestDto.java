package com.example.Book_my_show.Dtos.Request;

import com.example.Book_my_show.Enums.ShowType;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class ShowRequestDto {

    private LocalDate localDate;
    private LocalTime localTime;
    private ShowType showType;
    private int movieId;
    private int theaterId;
    private int classicSeatPrice;
    private int premiumSeatPrice;
}
