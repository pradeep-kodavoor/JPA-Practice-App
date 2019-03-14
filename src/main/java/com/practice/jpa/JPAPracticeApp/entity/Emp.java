package com.practice.jpa.JPAPracticeApp.entity;

import javax.persistence.Entity;

@Entity
public class Emp extends Person {

	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
}
