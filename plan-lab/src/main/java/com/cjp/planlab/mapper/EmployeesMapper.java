package com.cjp.planlab.mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.cjp.planlab.dtos.EmployeesDto;

import com.cjp.planlab.entities.Employees;

@Component
public class EmployeesMapper implements ModelMapper<Employees, EmployeesDto>{

	@Override
	public EmployeesDto transformToDto(Employees entity) {
		EmployeesDto dto = new EmployeesDto();
		if(entity != null) {
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setSurname(entity.getSurname());
			dto.setNif(entity.getNif());
			dto.setEmail(entity.getEmail());
			dto.setTelephone(entity.getTelephone());
			
			
		}
		return dto;
	
	}

	@Override
	public Employees transformToPojo(EmployeesDto dto) throws ParseException {
		Employees entity = new Employees();
		if(entity != null) {
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setSurname(dto.getSurname());
			entity.setNif(dto.getNif());
			entity.setEmail(dto.getEmail());
			entity.setTelephone(dto.getTelephone());
		}
		return entity;
	}

	@Override
	public List<EmployeesDto> transformToDto(List<Employees> entities) {
		List<EmployeesDto> listaDto = new ArrayList<>();

		if (entities != null && !entities.isEmpty()) {
			for (Employees entity : entities) {
				listaDto.add(transformToDto(entity));
			}
		}

		return listaDto;
	}

	@Override
	public List<Employees> transformToPojo(List<EmployeesDto> dtos) throws ParseException {
		List<Employees> listaPojo = new ArrayList<>();

		if (dtos != null && !dtos.isEmpty()) {
			for (EmployeesDto dto : dtos) {
				listaPojo.add(transformToPojo(dto));
			}
		}

		return listaPojo;
	}

	@Override
	public Set<EmployeesDto> transformSetToDto(Set<Employees> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Set<Employees> transformSetToPojo(Set<EmployeesDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<EmployeesDto> transformToDto(Page<Employees> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<Employees> transformToPojo(Page<EmployeesDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

}
