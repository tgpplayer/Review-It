package com.example.reviews.service;

import java.time.LocalDateTime;

import com.example.reviews.models.UserModel;

public interface LoginService {
	
	boolean userExists(UserModel user, LocalDateTime dateTime);
	LocalDateTime getLoginDeadline(String username);
}
