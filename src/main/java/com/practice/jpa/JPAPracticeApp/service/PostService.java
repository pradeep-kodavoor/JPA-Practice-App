package com.practice.jpa.JPAPracticeApp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.jpa.JPAPracticeApp.entity.Post;

@Service
public class PostService {

	@Autowired
	PostRepository postRepository;

	@Autowired
	PostDAOService postDAOService;

	@Transactional
	public void saveAndUpdatePost(Post post) {
		// postRepository.save(post);
		postDAOService.insertPost(post);
		System.out.println("Updating post..");
		post.getComments().remove(0);
		// post.setTitle("Hibernate ORM Relation Mapping");
	}

}
