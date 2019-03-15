package com.practice.jpa.JPAPracticeApp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PostComment {

	@Id
	@GeneratedValue
	private Long id;

	private String comment;

	//One to many bidirectional mapping
	@ManyToOne
	@JoinColumn(name = "POST_ID")
	private Post post;

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public PostComment() {
		super();
	}

	public PostComment(String comment) {
		super();
		this.comment = comment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "PostComment [id=" + id + ", comment=" + comment + "]";
	}
}
