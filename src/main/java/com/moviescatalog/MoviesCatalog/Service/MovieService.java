package com.moviescatalog.MoviesCatalog.Service;

import com.moviescatalog.MoviesCatalog.Model.Movie;
import com.moviescatalog.MoviesCatalog.Repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public List<Movie> listAll() {
        return repository.findAll();
    }

    public Movie save(Movie movie) {
        return repository.save(movie);
    }

    public Movie searchById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
