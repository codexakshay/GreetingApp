package com.blz.greeting.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "greet")
public class Greeting {
	@Id
	private long id;
	private String message;

	public Greeting() {
		id = 0;
		message = "";
	}

	public Greeting(long id, String message) {
		this.id = id;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String name) {
		this.message = name;
	}
}