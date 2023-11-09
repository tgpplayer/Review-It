package com.example.reviews.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reviews.mappers.UserMapper;
import com.example.reviews.models.UserModel;
import com.example.reviews.repository.RegisterRepo;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	private RegisterRepo registerRepo;
	
	@Autowired
	private UserMapper uMapper;
	
	@Override
	public void registerUser(UserModel user) {
		registerRepo.save(uMapper.toEntity(user));
	}
	
}
