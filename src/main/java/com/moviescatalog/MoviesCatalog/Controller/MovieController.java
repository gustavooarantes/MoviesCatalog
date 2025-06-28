package com.moviescatalog.MoviesCatalog.Controller;

import com.moviescatalog.MoviesCatalog.Model.Movie;
import com.moviescatalog.MoviesCatalog.Service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService service;

    public MovieController(MovieService service) {
        this.service = service;
    }

    @GetMapping
    public List<Movie> listar() {
        return service.listAll();
    }

    @PostMapping
    public Movie create(@RequestBody Movie movie) {
        return service.save(movie);
    }

    @GetMapping("/{id}")
    public Movie searchById(@PathVariable Long id) {
        return service.searchById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
