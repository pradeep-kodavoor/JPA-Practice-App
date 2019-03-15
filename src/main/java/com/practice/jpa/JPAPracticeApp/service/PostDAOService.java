package com.practice.jpa.JPAPracticeApp.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.jpa.JPAPracticeApp.entity.Post;
import com.practice.jpa.JPAPracticeApp.entity.PostComment;

@Repository
@Transactional
public class PostDAOService {

	@Autowired
	EntityManager entityManager;

	public void insertPost(Post post) {
		System.out.println("Adding post..");
		entityManager.persist(post);
	}

	public void updatePost(Post post) {
		System.out.println("Updating post..");
		entityManager.find(Post.class, 1L);
		PostComment comment = post.getComments().get(0);
		post.removeComment(comment);
		entityManager.merge(post);

	}

	public void insertPostComment(PostComment comment) {
		System.out.println("Adding comment..");
		entityManager.persist(comment);
	}
}
