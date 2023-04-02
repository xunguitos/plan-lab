package com.cjp.planlab.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column (name = "id_employees")
	private Long id;
	
	@Column (name = "name")
	private String name;
	
	@Column (name = "surname")
	private String surname;
	
	@Column (name = "nif")
	private String nif;
	
	@Column (name = "telephone")
	private Long telephone;
	
	@Column (name = "email")
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}
	
	public String getEmail () {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
