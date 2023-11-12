package com.example.reviews.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.reviews.entities.ProductEntity;
import com.example.reviews.models.ProductModel;

@Mapper(componentModel = "spring")
public interface ProductMapper {
	ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	
	ProductEntity toEntity(ProductModel product);
	ProductModel toModel(ProductEntity product);
}
