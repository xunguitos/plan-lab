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
import com.cjp.planlab.services.IEmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
	@Autowired
	private IEmployeesService employeesService;
	
	@GetMapping("/list")
	public ResponseEntity<List<EmployeesDto>> getAllEmployees(){
		return ResponseEntity.ok().body(employeesService.findAllEmployees());
	}
	
	@PostMapping("/create")
	public ResponseEntity<EmployeesDto> createEmployees(@RequestBody EmployeesDto employeesDto)throws ParseException{
		return ResponseEntity.status(HttpStatus.CREATED).body(employeesService.save(employeesDto));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<EmployeesDto> updateEmployees(@PathVariable Long id,@RequestBody EmployeesDto employeesDto)throws ParseException{
		return ResponseEntity.ok().body(employeesService.update(employeesDto));
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmployees (EmployeesDto employeesDto) throws IllegalArgumentException, ParseException {
		
		employeesService.deleteEmployees(employeesDto);
		
	}
}
