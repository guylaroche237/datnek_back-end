package com.guy.datnek.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {
	@Id
	@GeneratedValue
	public long id;
	public int userId;
	public String title;
	public boolean completed;
	public Todo(int userId, String title, boolean completed) {
		super();
		this.userId = userId;
		this.title = title;
		this.completed = completed;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Todo() {
		super();
	}
	
	

}
