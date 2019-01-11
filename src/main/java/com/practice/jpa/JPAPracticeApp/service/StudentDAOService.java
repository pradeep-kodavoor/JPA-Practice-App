package com.practice.jpa.JPAPracticeApp.service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.jpa.JPAPracticeApp.entity.Address;
import com.practice.jpa.JPAPracticeApp.entity.Student;

@Repository
@Transactional
public class StudentDAOService {

	@Autowired
	EntityManager entityManager;

	public long insertAddress(Address address) {

		entityManager.persist(address);
		return address.getId();
	}

	public long insertStudent(Student student) {

		entityManager.persist(student);
		return student.getId();
	}

	public Student getStudent() {
		return entityManager.find(Student.class, 4);
	}

}
