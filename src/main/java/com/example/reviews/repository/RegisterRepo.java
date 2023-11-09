package com.example.reviews.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.reviews.entities.UserEntity;

public interface RegisterRepo extends JpaRepository<UserEntity, Long> {

}
