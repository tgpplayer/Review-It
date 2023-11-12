package com.example.reviews.models;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserModel {
	
	private long id;
	private byte[] avatar;
	private String username;
	private String password;
	private LocalDateTime lastLogin;
	
}
