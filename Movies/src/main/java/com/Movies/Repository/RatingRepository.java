package com.Movies.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Movies.Entity.Rating;
@Repository
public interface RatingRepository extends JpaRepository<Rating, String>{

}
