package com.cjp.planlab.services;

import java.text.ParseException;
import java.util.List;

import com.cjp.planlab.dtos.EmployeesDto;

public interface IEmployeesService {

	List<EmployeesDto> findAllEmployees();
	
	EmployeesDto save (EmployeesDto employeesDto) throws IllegalArgumentException, ParseException;

	EmployeesDto update(EmployeesDto employeesDto)throws IllegalArgumentException, ParseException;

	void deleteEmployees(EmployeesDto employeesDto) throws IllegalArgumentException, ParseException;
	
	
	

}
