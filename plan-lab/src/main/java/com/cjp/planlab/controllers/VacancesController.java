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

import com.cjp.planlab.dtos.VacancesDto;
import com.cjp.planlab.services.IVacancesService;

@RestController
@RequestMapping("/vancances")
public class VacancesController {

	@Autowired
	private IVacancesService vacancesService;
	
	@PostMapping ("/create")
	public ResponseEntity<VacancesDto> createVacances(@RequestBody VacancesDto vacancesDto) throws ParseException{
		return ResponseEntity.status(HttpStatus.CREATED).body(vacancesService.save(vacancesDto));
	}
	
	@GetMapping ("/list")
	public ResponseEntity<List<VacancesDto>> geetAllVacances(){
		return ResponseEntity.ok().body(vacancesService.findAllVacances());
	}
	
	@PutMapping ("/update/{id}")
	public ResponseEntity<VacancesDto> updateVacances (@PathVariable Long id,@RequestBody VacancesDto vacancesDto)throws ParseException{
		return ResponseEntity.ok().body(vacancesService.update(vacancesDto));
	}
	
	@DeleteMapping ("/delete/{id}")
	public void deleteVacances(@PathVariable (name="id")Long id)throws IllegalArgumentException, ParseException {
		vacancesService.deleteVacances(id);
	}
}
