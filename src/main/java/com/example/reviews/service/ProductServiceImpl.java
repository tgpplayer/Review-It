package com.example.reviews.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reviews.entities.ProductEntity;
import com.example.reviews.mappers.ProductMapper;
import com.example.reviews.models.ProductModel;
import com.example.reviews.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo pRepo;
	
	@Autowired
	private ProductMapper pMapper;
	
	@Override
	public void uploadProduct(ProductModel product) {
		pRepo.save(pMapper.toEntity(product));
	}

	@Override
	public List<ProductModel> getProducts() {
		List<ProductEntity> productEntities = pRepo.findAll();
		List<ProductModel> productModel = new ArrayList<ProductModel>();
		
		for(ProductEntity entity: productEntities) {
			productModel.add(pMapper.toModel(entity));
		}
		return productModel;
	}

}
