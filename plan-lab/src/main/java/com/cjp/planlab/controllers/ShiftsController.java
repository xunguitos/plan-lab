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

import com.cjp.planlab.dtos.ShiftsDto;
import com.cjp.planlab.services.IShiftsService;

@RestController
@RequestMapping("/shifts")
public class ShiftsController {
	
	@Autowired
	private IShiftsService shiftsService;
	
	
	@GetMapping("/list")
	public ResponseEntity<List<ShiftsDto>> getAllShifts(){
		return ResponseEntity.ok().body(shiftsService.findAllShifts());
	}
	
	@PostMapping("/create")
	public ResponseEntity<ShiftsDto> createShift(@RequestBody ShiftsDto shiftsDto) throws ParseException{
		return ResponseEntity.status(HttpStatus.CREATED).body(shiftsService.save(shiftsDto));
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ShiftsDto> updateShift(@PathVariable(name="id") Long id, @RequestBody ShiftsDto shiftsDto) throws ParseException{
		return ResponseEntity.ok().body(shiftsService.update(shiftsDto));
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteShift(@PathVariable(name="id") Long id) throws IllegalArgumentException, ParseException {
		shiftsService.delete(id);	
	}

}
