package com.guy.datnek.entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employe {
	@Id
	@GeneratedValue
	public long id;
	public String name;
	public String position;
	public String dept;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employe(long id, String name, String position, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.dept = dept;
	}
	public Employe() {
	
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
