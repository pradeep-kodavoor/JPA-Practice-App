package com.practice.jpa.JPAPracticeApp.CommandLineRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.practice.jpa.JPAPracticeApp.entity.Book;
import com.practice.jpa.JPAPracticeApp.entity.Pen;
import com.practice.jpa.JPAPracticeApp.service.ProductRepository;

public class InheritanceCommandLineRunner implements CommandLineRunner {

	@Autowired
	ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {

		Book cleanCode = new Book();
		cleanCode.setName("Clean Code");
		cleanCode.setAuthor("Robert C Martin");

		productRepository.save(cleanCode);

		Pen parker = new Pen();
		parker.setName("Parker");
		parker.setColor("Blue");

		productRepository.save(parker);

	}

}
