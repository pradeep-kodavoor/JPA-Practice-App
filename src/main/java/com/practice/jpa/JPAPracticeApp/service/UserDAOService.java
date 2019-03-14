package com.practice.jpa.JPAPracticeApp.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.practice.jpa.JPAPracticeApp.entity.User;

@Repository
@Transactional
public class UserDAOService {

	@PersistenceContext
	private EntityManager entityManager;

	public long insertUser(User user) {

		entityManager.persist(user);
		return user.getId();
	}

}
