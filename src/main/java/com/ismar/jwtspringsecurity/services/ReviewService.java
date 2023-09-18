package com.ismar.jwtspringsecurity.services;

import com.ismar.jwtspringsecurity.models.Movie;
import com.ismar.jwtspringsecurity.models.Review;
import com.ismar.jwtspringsecurity.repositories.MovieRepository;
import com.ismar.jwtspringsecurity.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository repository;

    @Autowired
    private MovieRepository movieRepository;

    public Review createReview(String reviewBody, String imdbId) {
        Review review = new Review(reviewBody, LocalDateTime.now(), LocalDateTime.now());

        Optional<Movie> movie = movieRepository.findMovieByImdbId(imdbId);

        review.setMovie(movie.get());

        Review savedReview = repository.save(review);

        return review;
    }
}
