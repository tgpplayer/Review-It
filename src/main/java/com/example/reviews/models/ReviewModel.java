package com.example.reviews.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReviewModel {

	private long id;
	private ProductModel product;
	private UserModel userReviewing;
	private String review;
	
}
