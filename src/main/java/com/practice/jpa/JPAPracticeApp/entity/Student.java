package com.practice.jpa.JPAPracticeApp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue
	@Column(name = "STUDENT_ID")
	private Long id;
	private String name;


	//@OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
	//@JoinColumn(name = "ADDRESS_ID")
	
	@OneToOne
	private Address address;

	public Student() {
		super();
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}


	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


}
