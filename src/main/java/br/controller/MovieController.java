package br.controller;

import br.entity.Movie;
import br.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @GetMapping("/movies")
    public List<Movie> getAll(){
        return movieRepository.findAll();
    }

    @GetMapping("/movies/{id}")
    public ResponseEntity<Movie> getById(@PathVariable(value = "id") Long movieId){
        return null;
    }

    @PostMapping("/movies")
    public Movie create(@RequestBody Movie movie){
        return movieRepository.save(movie);
    }

    @PutMapping("/movies/{id}")
    public ResponseEntity<Movie> update(@PathVariable(value = "id") Long movieId, @RequestBody Movie movieDetails){
        return null;
    }

    @DeleteMapping("/movies/{id}")
    public void deleteUser(@PathVariable(value = "id") Long movieId) throws Exception {
    }
}
