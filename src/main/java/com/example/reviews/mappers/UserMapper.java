package com.example.reviews.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.reviews.entities.UserEntity;
import com.example.reviews.models.UserModel;

@Mapper(componentModel = "spring")
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
	
	UserModel toModel(UserEntity userEntity);
	UserEntity toEntity(UserModel userModel);
}
