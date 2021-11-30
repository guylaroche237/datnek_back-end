package com.guy.datnek.entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {
	@Id
	@GeneratedValue
	public long id;
	public String langue;
	public String nivoParler;
	public String nivoEcrit;
	public String nivoComprehension;
	
	public User(String langue, String nivoParler, String nivoEcrit, String nivoComprehension) {
		super();
		this.langue = langue;
		this.nivoParler = nivoParler;
		this.nivoEcrit = nivoEcrit;
		this.nivoComprehension = nivoComprehension;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	public String getNivoParler() {
		return nivoParler;
	}

	public void setNivoParler(String nivoParler) {
		this.nivoParler = nivoParler;
	}

	public String getNivoEcrit() {
		return nivoEcrit;
	}

	public void setNivoEcrit(String nivoEcrit) {
		this.nivoEcrit = nivoEcrit;
	}

	public String getNivoComprehension() {
		return nivoComprehension;
	}

	public void setNivoComprehension(String nivoComprehension) {
		this.nivoComprehension = nivoComprehension;
	}
	
	
	
	

}
