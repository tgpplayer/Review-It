package com.example.reviews.service;

import java.util.List;

import com.example.reviews.models.ReviewModel;

public interface ReviewService {
	
	void uploadReview(ReviewModel review);
	List<ReviewModel>getReviewsFromProduct(long id);
}
