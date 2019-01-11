package com.practice.jpa.JPAPracticeApp.CommandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.jpa.JPAPracticeApp.entity.User;
import com.practice.jpa.JPAPracticeApp.service.UserDAOService;

@Component
public class UserDAOServiceCommandLineRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner.class);

	@Autowired
	private UserDAOService userDAOService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Pradeep", "Associate");
		long id = userDAOService.insertUser(user);
		logger.info("User created with Service: " + user);
		
	}
}
