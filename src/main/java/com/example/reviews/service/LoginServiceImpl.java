package com.example.reviews.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reviews.entities.UserEntity;
import com.example.reviews.mappers.UserMapper;
import com.example.reviews.models.UserModel;
import com.example.reviews.repository.LoginRepo;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepo loginRepo;
	
	@Autowired
	private UserMapper uMapper;
	
	@Override
	public boolean userExists(UserModel user, LocalDateTime datetime) {
		List<UserEntity> DBusers = loginRepo.findAll();
		UserEntity userE = uMapper.toEntity(user);
		
		for(UserEntity u: DBusers) {
			if(u.getUsername().equals(userE.getUsername()) && u.getPassword().equals(userE.getPassword())) {
				u.setLastLogin(datetime);
				loginRepo.save(u);
				return true;
			}
		}
		return false;
	}

	@Override
	public LocalDateTime getLoginDeadline(String username) {
		return loginRepo.getLoginDeadline(username);
	}

}
