package com.Movies.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Movies.Entity.Movie;
import com.Movies.Logic.Interface;
import com.Movies.dto.MovieDto;

@RestController
@RequestMapping("/api")
public class MovieController {

	@Autowired
	Interface interf;

	@GetMapping
	@RequestMapping("/longest-duration-movies")
	public List<Movie> getTop10LongestMovies() {
		return interf.getTop10LongestMovies();

	}

	@PostMapping
	@RequestMapping("/new-movie")
	ResponseEntity<String> saveMovie(@RequestBody Movie movie) {
		return interf.saveMovie(movie);
	}

	@GetMapping
	@RequestMapping("/rating-six")
	public List<MovieDto> getAllMoviesWithAverageRating() {
		return interf.findAllWithRating();
	}

}
