package com.cjp.planlab.controllers;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjp.planlab.dtos.EmployeesDto;
import com.cjp.planlab.dtos.PetitionsDto;
import com.cjp.planlab.services.IPetitionsService;

@RestController
@RequestMapping("/petitions")
public class PetitionsController {
	
	@Autowired
	private IPetitionsService petitionsService;
	
	@GetMapping("/list")
	public ResponseEntity<List<PetitionsDto>> getAllPetitions(){
		return ResponseEntity.ok().body(petitionsService.findAllPetitions());
	}
	
	@PostMapping("/create")
	public ResponseEntity<PetitionsDto> createPetitions(@RequestBody PetitionsDto petitionDto) throws ParseException{
		return ResponseEntity.status(HttpStatus.CREATED).body(petitionsService.save(petitionDto));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<PetitionsDto> updatePetition(@PathVariable(name="id") Long id, @RequestBody PetitionsDto petitionDto) throws ParseException{
		return ResponseEntity.ok().body(petitionsService.update(petitionDto));
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployees(@PathVariable(name="id") Long id) throws IllegalArgumentException, ParseException {
		petitionsService.delete(id);	
	}

}
