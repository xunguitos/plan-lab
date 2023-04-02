package com.cjp.planlab.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjp.planlab.dtos.EmployeesDto;
import com.cjp.planlab.services.IEmployeesService;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

	@Autowired
	private IEmployeesService employeesService;
	
	/*@GetMapping("/list")
	public ResponseEntity<List<EmployeesDto>> getAllEmployees(){
		return ResponseEntity.ok().body(employeesService.findAllEmployees());
	}*/
	
	
	
}
