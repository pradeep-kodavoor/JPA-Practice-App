package com.practice.jpa.JPAPracticeApp.CommandLineRunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.practice.jpa.JPAPracticeApp.entity.User;
import com.practice.jpa.JPAPracticeApp.service.UserRepository;

@Component
public class UserRespositoryCommandLineRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(UserRespositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		/*try {
			User jagath = new User("Jagath", "Associate");
			userRepository.save(jagath);
			User marut = new User("Marut", "Senior Associate");
			userRepository.save(marut);
			User avinash = new User("Avinash", "Associate");
			userRepository.save(avinash);
			User nithin = new User("Nithin", "Associate");
			userRepository.save(nithin);
		} catch (RuntimeException e) {
			logger.info("Exception Raised!!");

		}*/

		logger.info("All Users: " + userRepository.findAll());
		logger.info("User with ID:1 " + userRepository.findById(1L));

	}

}
