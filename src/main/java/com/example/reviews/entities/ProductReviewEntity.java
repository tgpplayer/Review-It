package com.example.reviews.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products_reviews")
public class ProductReviewEntity {
	
	@Id
	@GeneratedValue
	private long id;
	@ManyToOne
	private UserEntity owner;
	private byte[] product;
	@ManyToOne
	private UserEntity reviewer;
	private String review;
	
}
