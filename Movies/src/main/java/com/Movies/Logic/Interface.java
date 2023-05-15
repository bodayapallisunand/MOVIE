package com.Movies.Logic;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.Movies.Entity.Movie;
import com.Movies.dto.MovieDto;

public interface Interface {

	List<Movie> getTop10LongestMovies();

	ResponseEntity<String> saveMovie(Movie movie);

	List<MovieDto> findAllWithRating();

}
