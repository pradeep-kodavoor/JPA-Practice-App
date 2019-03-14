package com.practice.jpa.JPAPracticeApp.CommandLineRunner;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.jpa.JPAPracticeApp.entity.Post;
import com.practice.jpa.JPAPracticeApp.entity.PostComment;
import com.practice.jpa.JPAPracticeApp.service.PostDAOService;

@Component
public class PostDAOServiceCommandLineRunner implements CommandLineRunner {

	@Autowired
	PostDAOService postDAOService;
	
	@Override
	public void run(String... args) throws Exception {

		// One to Many Mapping Example
		Post post = new Post("Hibernate relationship mapping");

		PostComment comment1 = new PostComment("Can you explain Many to Many relationship with more examples.");
		PostComment comment2 = new PostComment("What is the default fetch type in your example?");

		// postDAOService.insertPostComment(comment1);
		// postDAOService.insertPostComment(comment2);

		List<PostComment> comments = new ArrayList<>();
		comments.add(comment1);
		comments.add(comment2);

		post.setComments(comments);

		postDAOService.insertPost(post);

	}

}
