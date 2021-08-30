package com.dhadji.moviesapi.controller;

import com.dhadji.moviesapi.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Controllers contain information about the endpoints
 */
// Annotation for controller
@RestController
public class MoviesController {

    @GetMapping("/api/movies") // GEtMapping as it is a GEt endpoint / method
    @ResponseStatus(HttpStatus.CREATED) // Default 200 if this annotation is missing
    public List<Movie> getAllMovies() {

        List<Movie> result = getMoviesFromDB();

        System.out.println("Returning all movies " + result);

        return result;
    }

    @GetMapping("/api/movies/{id}")  // With curly brackets {} you define PATH VARIABLES in the url
    public Movie getMovieById(@PathVariable String id) {  // With @PathVariable you map the url variable with the method variable
        List<Movie> movies = getMoviesFromDB();
        Movie movie = new Movie();

        // iterate with Streams / java 8 -> TODO

        // klasikos tropos for loop
        for(Movie e : movies) {
            if(id.equals(e.getId())) {
                return e;
            }
        }

        return movie; // Return error code (404 NOT_FOUND) and an error body (JSON) -> TODO
    }

    // TODO Exercise
    // Add more movies
    // Create Endpoint that returns movie by name
    // Create Endpoint that returns movie by year
    // Create Endpoint that returns all movies greater than year passed

    public List<Movie> getMoviesFromDB() {
        List<Movie> movies = new ArrayList<>();

        Movie movie = new Movie();
        movie.setId("1");
        movie.setName("friends");
        movie.setDuration(100d);
        movie.setYear(1999);

        Movie movie1 = new Movie();
        movie1.setId("2");
        movie1.setName("molly");
        movie1.setDuration(200d);
        movie1.setYear(2021);

        movies.add(movie);
        movies.add(movie1);

        return movies;
    }
}

//////////////////
// Gia to endpoint
// Poio url na xrisimopoiiseis
// Ti na kanei to endpoint (business logic)
// Ti status code na gurizei (2xx kala codes / 4xx i 5xx kaka codes)
// Ti body na epistrefeis (To Rest API gurizei JSON)

// Stin clasi -> @RestController
// Sti methodo -> @GetMapping / @PostMapping / ...

