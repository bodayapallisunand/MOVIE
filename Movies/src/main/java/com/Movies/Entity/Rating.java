package com.Movies.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ratings")
public class Rating {

	@Id
	@Column(name = "tconst")
	private String tconst;

	@Column(name = "AVERAGErATING")
	@JsonProperty("AVERAGErATING")
	private double averageRating;

	@Column(name = "NUMvOTES")
	@JsonProperty("NUMvOTES")
	private long numVotes;

	@OneToOne
	@JoinColumn(name = "tconst")
	private Movie movie;

	public Rating() {

	}

	public String getTconst() {
		return tconst;
	}

	public void setTconst(String tconst) {
		this.tconst = tconst;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	public long getNumVotes() {
		return numVotes;
	}

	public void setNumVotes(long numVotes) {
		this.numVotes = numVotes;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Rating(String tconst, double averageRating, long numVotes, String imdbId, Movie movie) {
		super();
		this.tconst = tconst;
		this.averageRating = averageRating;
		this.numVotes = numVotes;
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Rating [tconst=" + tconst + ", averageRating=" + averageRating + ", numVotes=" + numVotes + ",  movie="
				+ movie + "]";
	}

}
