package com.example.reviews.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.reviews.entities.ReviewEntity;
import com.example.reviews.models.ReviewModel;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
	ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);
	
	ReviewEntity toEntity(ReviewModel review);
	ReviewModel toModel(ReviewEntity review);
}
