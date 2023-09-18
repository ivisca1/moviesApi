package com.ismar.jwtspringsecurity.repositories;

import com.ismar.jwtspringsecurity.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> findMovieByImdbId(String imdbId);
}
