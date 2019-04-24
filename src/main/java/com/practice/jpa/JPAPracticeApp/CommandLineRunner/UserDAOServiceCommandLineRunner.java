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
		try {
			User pradeep = new User("Pradeep", "Associate");
			userDAOService.insertUser(pradeep);
			User jagath = new User("Jagath", "Associate");
			userDAOService.insertUser(jagath);
			User nithin = new User("Nithin", "Associate");
			userDAOService.insertUser(nithin);
		} catch (RuntimeException e) {
			logger.info("Exception Raised!!");

		}

	}
}
