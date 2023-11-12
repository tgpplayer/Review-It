package com.example.reviews.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.reviews.entities.UserEntity;

public interface LoginRepo extends JpaRepository<UserEntity, Long>{
	@Query(value = "SELECT DATE_ADD(lastLogin, INTERVAL 30 MINUTE) FROM users WHERE username = :username", nativeQuery = true)
	LocalDateTime getLoginDeadline(@Param("username") String username);
}
