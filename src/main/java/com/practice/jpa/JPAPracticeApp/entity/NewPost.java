package com.practice.jpa.JPAPracticeApp.entity;

import java.util.ArrayList;
import java.util.List;

public class NewPost {

	private Long id;
	private String title;

	List<Tag> tags = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

}
