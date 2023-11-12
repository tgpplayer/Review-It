package com.example.reviews.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reviews.entities.ReviewEntity;
import com.example.reviews.mappers.ReviewMapper;
import com.example.reviews.models.ReviewModel;
import com.example.reviews.repository.ReviewRepo;

@Service
public class ReviewServiceImpl implements ReviewService {
	
	@Autowired
	private ReviewRepo rRepo;
	
	@Autowired
	private ReviewMapper rMapper;
	
	@Override
	public void uploadReview(ReviewModel review) {
		rRepo.save(rMapper.toEntity(review));
	}

	@Override
	public List<ReviewModel> getReviewsFromProduct(long id) {
		List<ReviewEntity> reviewEntities = rRepo.getReviewsFromProduct(id);
		
		List<ReviewModel> reviewModels = new ArrayList<ReviewModel>();
		for(ReviewEntity entity: reviewEntities) {
			reviewModels.add(rMapper.toModel(entity));
		}
		return reviewModels;
	}
	
}
