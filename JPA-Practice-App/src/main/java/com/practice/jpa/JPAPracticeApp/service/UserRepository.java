package com.practice.jpa.JPAPracticeApp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.jpa.JPAPracticeApp.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
