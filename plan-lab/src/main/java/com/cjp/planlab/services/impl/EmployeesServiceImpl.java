package com.cjp.planlab.services.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.cjp.planlab.dtos.EmployeesDto;
import com.cjp.planlab.mapper.EmployeesMapper;
import com.cjp.planlab.repository.EmployeesRepository;
import com.cjp.planlab.services.IEmployeesService;


@Service
public class EmployeesServiceImpl implements IEmployeesService{

	
	@Autowired
	private EmployeesRepository employeesRepository;
	
	@Autowired
	private EmployeesMapper employeesMapper;
	
	@Override
	public List<EmployeesDto> findAllEmployees() {
		return employeesMapper.transformToDto(employeesRepository.findAll());
	}
	
	@Override
	@Modifying
	public EmployeesDto save (EmployeesDto employeesDto) throws IllegalArgumentException, ParseException{
		return employeesMapper.transformToDto(employeesRepository.save(employeesMapper.transformToPojo(employeesDto)));
	}

	@Override
	public void deleteEmployees(EmployeesDto employeesDto) throws IllegalArgumentException, ParseException {
		employeesRepository.delete(employeesMapper.transformToPojo(employeesDto));
		
	}

	@Override
	public EmployeesDto update(EmployeesDto employeesDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return employeesMapper.transformToDto(employeesRepository.save(employeesMapper.transformToPojo(employeesDto)));
	}

	

}
