package com.example.reviews.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.reviews.entities.ReviewEntity;

public interface ReviewRepo extends JpaRepository<ReviewEntity, Long> {
	@Query(value = "SELECT * FROM reviews WHERE product = :id", nativeQuery = true)
	List<ReviewEntity> getReviewsFromProduct(@Param("id") long id);
}
