package com.cjp.planlab.dtos;

import java.util.ArrayList;
import java.util.List;

import com.cjp.planlab.entities.Petitions;

public class EmployeesDto {

	private Long id;
	
	private String name;
	
	private String surname;
	
	private String nif;
	
	private Long telephone;
	
	private String email;
	
	private List<PetitionsDto> petitions;
	
	private List<ShiftsDto> shift;

	
	public EmployeesDto(){
		this.petitions = new ArrayList<PetitionsDto>();
		this.shift = new ArrayList<ShiftsDto>();
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

	public List<PetitionsDto> getPetitions() {
		return petitions;
	}

	public void setPetitions(List<PetitionsDto> petitions) {
		this.petitions = petitions;
	}
	
}
