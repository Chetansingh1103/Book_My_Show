package com.example.Book_my_show.Repositories;

import com.example.Book_my_show.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
}
