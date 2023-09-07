package com.example.Book_my_show.Repositories;

import com.example.Book_my_show.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie,Integer> {
    @Query(value = "select m.movie_name from movies m join shows s on m.id = s.movie_id group by s.movie_id order by count(s.movie_id) desc limit 1",nativeQuery = true)
    String getMovieNameByMaximumShow();

    @Query(value = "select * from movies",nativeQuery = true)
    List<Movie> getAllMovies();
}
