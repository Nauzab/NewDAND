package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity // to use relation with other tables
@Table(name="ManagerTable")//to create table automatically

public class Manager {
	@Id // value will be unique
	@GeneratedValue(strategy=GenerationType.AUTO) // database will generate unique ID
	@Column(name="ID_m")//id column will be in table
	private int id;
	
	@NotEmpty
	@NotNull
	@Pattern(regexp="[a-zA-z]+", message="Please write correct surname incuding only letters")
	@Column(name="Name")
	private String name;
	
	
	@NotEmpty
	@NotNull
	@Pattern(regexp="[a-zA-z]+", message="Please write correct surname incuding only letters")
	@Column(name="Surname")
	private String surname;
	
	@NotEmpty
	@NotNull
	@Size(min=6, max=20)
	@Pattern(regexp="^[a-zA-Z0-9]{4,10}$", message="Password can consist of letters and numbers")
	@Column(name="Password")
	private String password;
	
	@NotEmpty
	@NotNull
	@Column(name="e-mail")
	private String email;
	
	public Manager() {
		
	}
	
	
	

	public Manager(int id, String name, String surname, String password, String email) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
