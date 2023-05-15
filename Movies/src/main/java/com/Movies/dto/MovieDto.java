package com.Movies.dto;

public class MovieDto {
	private String tconst;
	private String titleType;
	private String primaryTitle;
	private long runtimeMinutes;
	private String genres;
	private double averageRating;
	
	public MovieDto() {
		
	}

	public MovieDto(String tconst, String titleType, String primaryTitle, long runtimeMinutes, String genres,
			double averageRating) {
		super();
		this.tconst = tconst;
		this.titleType = titleType;
		this.primaryTitle = primaryTitle;
		this.runtimeMinutes = runtimeMinutes;
		this.genres = genres;
		this.averageRating = averageRating;
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

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public String toString() {
		return "MovieDto [tconst=" + tconst + ", titleType=" + titleType + ", primaryTitle=" + primaryTitle
				+ ", runtimeMinutes=" + runtimeMinutes + ", genres=" + genres + ", averageRating=" + averageRating
				+ "]";
	}

}
