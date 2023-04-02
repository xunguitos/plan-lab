package com.cjp.planlab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjp.planlab.entities.Petitions;

public interface PetitionsRepository extends JpaRepository<Petitions, Long> {
	
	public List<Petitions> findAll();

}
