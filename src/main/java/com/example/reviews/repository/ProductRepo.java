package com.example.reviews.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reviews.entities.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Long>{

}
