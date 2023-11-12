package com.example.reviews.service;

import java.util.List;

import com.example.reviews.models.ProductModel;

public interface ProductService {

	void uploadProduct(ProductModel product);
	List<ProductModel> getProducts();
}
