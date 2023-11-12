package com.example.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.reviews.models.ReviewModel;
import com.example.reviews.service.ReviewService;

@RestController
public class ReviewController {
	
	@Autowired
	private ReviewService rService;
	
	@PutMapping("/leave-review")
	public ResponseEntity<ReviewModel> leaveReview(@RequestBody ReviewModel review) {
		rService.uploadReview(review);
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
	
	@GetMapping("/get-reviews")
	public ResponseEntity<List<ReviewModel>> getReviewsFromProduct(@RequestHeader long id) {
		return ResponseEntity.status(HttpStatus.OK).body(rService.getReviewsFromProduct(id));
	}
}
