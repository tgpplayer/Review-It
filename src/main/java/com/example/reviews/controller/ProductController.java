package com.example.reviews.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.reviews.models.ProductModel;
import com.example.reviews.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@PostMapping("/upload-product")
	public ResponseEntity<ProductModel> uploadProduct(@RequestBody ProductModel product) {
		productService.uploadProduct(product);
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
	
	@GetMapping("/get-products")
	public ResponseEntity<List<ProductModel>> getAllProducts() {
		return ResponseEntity.status(HttpStatus.OK).body(productService.getProducts());
	}
}
