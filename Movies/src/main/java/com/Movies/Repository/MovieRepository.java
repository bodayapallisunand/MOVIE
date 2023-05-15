package com.Movies.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.Movies.Entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

	@Query("SELECT m, AVG(r.averageRating) FROM Movie m JOIN m.rating r GROUP BY m HAVING AVG(r.averageRating) > 6.0 ORDER BY AVG(r.averageRating) DESC")
	List<Object[]> findAllWithRating();


}
