package com.example.reviews.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.reviews.models.UserModel;
import com.example.reviews.service.RegisterService;

@RestController
public class RegisterController {
	
	@Autowired
	private RegisterService registerService;
	
	//A comment
	@PostMapping("/register")
	public ResponseEntity<UserModel> registerUser (@RequestBody UserModel user) {
		registerService.registerUser(user);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
	
}
