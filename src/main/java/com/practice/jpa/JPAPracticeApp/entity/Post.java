package com.practice.jpa.JPAPracticeApp.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Post {
	
	@Id
	@GeneratedValue
	@Column(name = "POST_ID")
	private Long id;
	
	private String title;

	// One to many unidirectional mapping


	// One to many bidirectional mapping
	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)

	/*@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "POST_ID")*/
	private List<PostComment> comments;

	public Post() {
		super();
	}

	public Post(String title) {
		super();
		this.title = title;
		this.comments = new ArrayList<>();
	}

	public void addComment(PostComment comment) {
		comments.add(comment);
		comment.setPost(this);
	}

	public void removeComment(PostComment comment) {
		comments.remove(comment);
		comment.setPost(this);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (id == null ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
