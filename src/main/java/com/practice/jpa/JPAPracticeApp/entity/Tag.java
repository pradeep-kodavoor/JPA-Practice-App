package com.practice.jpa.JPAPracticeApp.entity;

import java.util.ArrayList;
import java.util.List;

public class Tag {

	private Long id;
	private String name;
	
	private List<NewPost> posts = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<NewPost> getPosts() {
		return posts;
	}

	public void setPosts(List<NewPost> posts) {
		this.posts = posts;
	}
	
	
	
	
}
