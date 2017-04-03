package com.popularmovies.vpaliy.domain.model;


import java.util.List;

public class MovieDetails {

    private int movieId;
    private MovieInfo movieInfo;
    private MovieCover movieCover;
    private List<Review> reviews;
    private List<Trailer> trailers;
    private List<ActorCover> cast;
    private List<MovieCover> similarMovies;

    public MovieDetails(int movieId){
        this.movieId=movieId;
    }

    public int getMovieId() {
        return movieId;
    }

    public List<ActorCover> getCast() {
        return cast;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public List<Trailer> getTrailers() {
        return trailers;
    }

    public MovieCover getMovieCover() {
        return movieCover;
    }

    public MovieInfo getMovieInfo() {
        return movieInfo;
    }

    public List<MovieCover> getSimilarMovies() {
        return similarMovies;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setCast(List<ActorCover> cast) {
        this.cast = cast;
    }

    public void setMovieCover(MovieCover movieCover) {
        this.movieCover = movieCover;
    }

    public void setMovieInfo(MovieInfo movieInfo) {
        this.movieInfo = movieInfo;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void setTrailers(List<Trailer> trailers) {
        this.trailers = trailers;
    }

    public void setSimilarMovies(List<MovieCover> similarMovies) {
        this.similarMovies = similarMovies;
    }
}
