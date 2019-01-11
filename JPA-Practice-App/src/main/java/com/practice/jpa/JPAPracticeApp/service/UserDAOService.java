package com.practice.jpa.JPAPracticeApp.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.jpa.JPAPracticeApp.entity.User;

@Repository
@Transactional
public class UserDAOService {

	@Autowired
	private EntityManager entityManager;

	public long insert(User user) {

		entityManager.persist(user);
		return user.getId();
	}

}
