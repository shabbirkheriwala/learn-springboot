package com.learn.springboot.hcmapp.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	Integer id;
	String fname;
	String lname;
	
	public Employee() {} // for JPA
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	
}
