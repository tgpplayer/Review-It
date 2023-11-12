package com.example.reviews.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.reviews.service.LoginService;

@RestController
public class LoginContinuingController {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/session-is-still-alive")
	public ResponseEntity<Boolean> sessionStillAlive(@RequestHeader String username, @RequestHeader LocalDateTime currentDateTime) {
		LocalDateTime loginDeadline = loginService.getLoginDeadline(username);
		
		if(currentDateTime.isAfter(loginDeadline)) {
			return ResponseEntity.status(HttpStatus.OK).body(false);
		}
		return ResponseEntity.status(HttpStatus.OK).body(false);
	}
}
