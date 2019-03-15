package com.practice.jpa.JPAPracticeApp.CommandLineRunner;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.jpa.JPAPracticeApp.entity.Post;
import com.practice.jpa.JPAPracticeApp.entity.PostComment;
import com.practice.jpa.JPAPracticeApp.service.PostDAOService;
import com.practice.jpa.JPAPracticeApp.service.PostRepository;
import com.practice.jpa.JPAPracticeApp.service.PostService;

@Component
public class PostDAOServiceCommandLineRunner implements CommandLineRunner {

	@Autowired
	PostDAOService postDAOService;
	
	@Autowired
	PostRepository postRepository;

	@Autowired
	PostService postService;

	@Autowired
	EntityManager entityManager;

	@Override
	public void run(String... args) throws Exception {

		// One to Many Mapping Example
		Post post = new Post("Hibernate relationship mapping");

		post.getComments().add(new PostComment("Can you explain Many to Many relationship with more examples."));
		post.getComments().add(new PostComment("What is the default fetch type in your example?"));

		/*postDAOService.insertPost(post);
		
		postDAOService.updatePost(post);*/
		
		/*Post post = new Post("Hibernate relationship mapping");
		post.addComment(new PostComment("Can you explain Many to Many relationship with more examples."));
		post.addComment(new PostComment("What is the default fetch type in your example?"));
		
		postDAOService.insertPost(post);
		postDAOService.updatePost(post);*/

		// entityManager.persist(post);
		

		postService.saveAndUpdatePost(post);

		// postRepository.save(post);

		


		// post.getComments().remove(0);

		// postDAOService.insertPost(post);

		

		// System.out.println("Updating post..");
		// postRepository.save(post);
	}

}
