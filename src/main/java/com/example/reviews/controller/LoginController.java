package com.example.reviews.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.reviews.models.UserModel;
import com.example.reviews.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public ResponseEntity<Boolean> login(@RequestBody UserModel user, @RequestHeader LocalDateTime newLastLogin) {
		boolean userExists = loginService.userExists(user, newLastLogin);
		return ResponseEntity.status(HttpStatus.OK).body(userExists);
	}
}
