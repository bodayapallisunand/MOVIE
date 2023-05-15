package com.Movies.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
//import org.springframework.data.annotation.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

	@Id
	@Column(name = "tconst")
	private String tconst;

	@Column(name = "TITLEtYPE")
	private String titleType;

	@Column(name = "PRIMARYtITLE")
	private String primaryTitle;

	@Column(name = "RUNtIMEmINUTES")
	private long runtimeMinutes;

	@Column(name = "genres")
	private String genres;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "movie")
	@JsonIgnoreProperties("movie")
	private Rating rating;

	public Movie() {

	}

	public Movie(String tconst, String titleType, String primaryTitle, long runtimeMinutes, String genres,
			Rating rating) {
		super();
		this.tconst = tconst;
		this.titleType = titleType;
		this.primaryTitle = primaryTitle;
		this.runtimeMinutes = runtimeMinutes;
		this.genres = genres;
		this.rating = rating;
	}

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public String getTitleType() {
		return titleType;
	}

	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}

	public String getPrimaryTitle() {
		return primaryTitle;
	}

	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}

	public long getRuntimeMinutes() {
		return runtimeMinutes;
	}

	public void setRuntimeMinutes(long runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}

	public String getGenres() {
		return genres;
	}

	public void setGenres(String genres) {
		this.genres = genres;
	}

	public Rating getRating() {
		return rating;
	}

	public void setRating(Rating rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [ tconst=" + tconst + ", titleType=" + titleType + ", primaryTitle=" + primaryTitle
				+ ", runtimeMinutes=" + runtimeMinutes + ", genres=" + genres + ", rating=" + rating + "]";
	}

}
