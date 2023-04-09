package com.cjp.planlab.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	private List<Petitions> petitions;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	private List<Shifts> shifts;
	
	public Employees(){
		this.petitions = new ArrayList<Petitions>();
		this.shifts = new ArrayList<Shifts>();
	}

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

	public List<Petitions> getPetitions() {
		return petitions;
	}

	public void setPetitions(List<Petitions> petitions) {
		this.petitions = petitions;
	}

	public List<Shifts> getShifts() {
		return shifts;
	}

	public void setShifts(List<Shifts> shifts) {
		this.shifts = shifts;
	}
	

}
