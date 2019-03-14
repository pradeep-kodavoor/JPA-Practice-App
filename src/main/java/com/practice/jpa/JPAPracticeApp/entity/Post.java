package com.practice.jpa.JPAPracticeApp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "POST_ID")
	private Long id;
	
	private String title;

	@OneToMany(mappedBy = "post")
	/* @JoinColumn(name = "POST_ID") */
	private List<PostComment> comments;

	public Post() {
		super();
	}

	public Post(String title) {
		super();
		this.title = title;
	}

	public List<PostComment> getComments() {
		return comments;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setComments(List<PostComment> comments) {
		this.comments = comments;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + "]";
	}

}
