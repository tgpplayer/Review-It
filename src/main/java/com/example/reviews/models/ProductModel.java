package com.example.reviews.models;

import com.example.reviews.entities.UserEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
	
	private long id;
	private UserEntity owner;
	private byte[] product;
	private String initialReview;
	
}
