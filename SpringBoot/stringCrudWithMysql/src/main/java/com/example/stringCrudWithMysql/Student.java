package com.example.stringCrudWithMysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students") // localhost:8080/h2-console

public class Student {
	@Id // how to inseret recod in h2 data base
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String name; // h2 data base program
	@Column
	private String email;

	// this class use for curd also
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
