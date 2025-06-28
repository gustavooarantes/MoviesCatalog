package com.moviescatalog.MoviesCatalog.Repository;

import com.moviescatalog.MoviesCatalog.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
