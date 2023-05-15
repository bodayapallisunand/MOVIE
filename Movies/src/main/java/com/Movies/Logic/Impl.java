package com.Movies.Logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.Movies.Entity.Movie;
import com.Movies.Entity.Rating;
import com.Movies.Repository.MovieRepository;
import com.Movies.Repository.RatingRepository;
import com.Movies.dto.MovieDto;

@Service
public class Impl implements Interface {

	@Autowired
	MovieRepository movieRepository;

	@Autowired
	RatingRepository ratingRepository;

	@Override
	public List<Movie> getTop10LongestMovies() {
		List<Movie> movies = movieRepository.findAll();
		Collections.sort(movies, Comparator.comparingLong(Movie::getRuntimeMinutes).reversed()); // Sort by runtime in
																									// descending order
		return movies.subList(0, Math.min(movies.size(), 10));

	}

	@Override
	public ResponseEntity<String> saveMovie(Movie movie) {
		// TODO Auto-generated method stub
		movie = movieRepository.save(movie);
		Rating rating = movie.getRating();
		rating.setMovie(movie);
		ratingRepository.save(rating);

		return ResponseEntity.ok("success");

	}

	@Override
	public List<MovieDto> findAllWithRating() {
		List<MovieDto> movieDtos = new ArrayList<>();
		List<Object[]> data = movieRepository.findAllWithRating();
		for (Object[] obj : data) {
			Movie movie = (Movie) obj[0];
			Double averageRating = (Double) obj[1];
			MovieDto movieDto = new MovieDto(movie.getTconst(), movie.getTitleType(), movie.getPrimaryTitle(),
					movie.getRuntimeMinutes(), movie.getGenres(), averageRating);
			movieDtos.add(movieDto);
		}
		return movieDtos;
	}

}
