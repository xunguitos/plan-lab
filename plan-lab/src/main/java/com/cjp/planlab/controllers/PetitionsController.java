package com.cjp.planlab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjp.planlab.dtos.PetitionsDto;
import com.cjp.planlab.services.IPetitionsService;

@RestController
@RequestMapping("/petitions")
public class PetitionsController {
	
	@Autowired
	private IPetitionsService petitionsService;
	
	
	public ResponseEntity<List<PetitionsDto>> getAllPetitions(){
		return ResponseEntity.ok().body(petitionsService.findAllPetitions());
	}

}
