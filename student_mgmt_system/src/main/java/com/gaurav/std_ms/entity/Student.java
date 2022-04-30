package com.gaurav.std_ms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="first_name", nullable=false)
	private String fname;
	@Column(name="last_name", nullable=false)
	private String lname;
	@Column(name="e_address",nullable=false)
	private String email;
	@Column(name="address")
	private String address;


	public Student() {

	}
   

	public Student(String fname, String lname, String email, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.address = address;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	



}