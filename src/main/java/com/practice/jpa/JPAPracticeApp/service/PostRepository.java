package com.practice.jpa.JPAPracticeApp.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.jpa.JPAPracticeApp.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
