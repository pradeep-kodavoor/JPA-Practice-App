package com.practice.jpa.JPAPracticeApp.entity;

import javax.persistence.Entity;

@Entity
/* @PrimaryKeyJoinColumn(name = "PET_ID") */
public class Pet extends Animal {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
