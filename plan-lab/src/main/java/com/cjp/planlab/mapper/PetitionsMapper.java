package com.cjp.planlab.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.cjp.planlab.dtos.EmployeesDto;
import com.cjp.planlab.dtos.PetitionsDto;
import com.cjp.planlab.entities.Employees;
import com.cjp.planlab.entities.Petitions;

@Component
public class PetitionsMapper implements ModelMapper<Petitions, PetitionsDto>{

	@Override
	public PetitionsDto transformToDto(Petitions entity) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		PetitionsDto dto = new PetitionsDto();
		
		if(entity != null) {
			dto.setId(entity.getId());
			dto.setMessage(entity.getMessage());
			dto.setReason(entity.getReason());
			
			List<String> days = new ArrayList<String>();
			String day = null;
			if(!entity.getDays().isEmpty() || entity.getDays() != null) {
				for(Date d : entity.getDays()) {
					day = new String();
					day = formato.format(d);
					
					days.add(day);
				}
				dto.setDays(days);
			}
			
			EmployeesDto employeeDto = null;
			if(entity.getEmployee() !=null) {
				employeeDto = new EmployeesDto();
				employeeDto.setEmail(entity.getEmployee().getEmail());
				employeeDto.setId(entity.getEmployee().getId());
				employeeDto.setName(entity.getEmployee().getName());
				employeeDto.setNif(entity.getEmployee().getNif());
				employeeDto.setSurname(entity.getEmployee().getSurname());
				employeeDto.setTelephone(entity.getEmployee().getTelephone());
			}
			
			dto.setEmployee(employeeDto);
		}
		return dto;
	}

	@Override
	public Petitions transformToPojo(PetitionsDto dto) throws ParseException {
		Petitions entity = new Petitions();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		
		if(dto != null) {
			entity.setId(dto.getId());
			entity.setMessage(dto.getMessage());
			entity.setReason(dto.getReason());
			
			List<Date> days = new ArrayList<Date>();
			Date day = null;
			if(!dto.getDays().isEmpty() || dto.getDays() != null) {
				for(String d : dto.getDays()) {
					day = new Date();
					day = formato.parse(d);
					
					days.add(day);
				}
				entity.setDays(days);
			}
			
			Employees employee = null;
			if(dto.getEmployee() !=null) {
				employee = new Employees();
				employee.setEmail(dto.getEmployee().getEmail());
				employee.setId(dto.getEmployee().getId());
				employee.setName(dto.getEmployee().getName());
				employee.setNif(dto.getEmployee().getNif());
				employee.setSurname(dto.getEmployee().getSurname());
				employee.setTelephone(dto.getEmployee().getTelephone());
			}
			
			entity.setEmployee(employee);
		}
		return entity;
	}

	@Override
	public List<PetitionsDto> transformToDto(List<Petitions> entities) {
		List<PetitionsDto> listaDto = new ArrayList<>();

		if (entities != null && !entities.isEmpty()) {
			for (Petitions entity : entities) {
				listaDto.add(transformToDto(entity));
			}
		}

		return listaDto;

	}

	@Override
	public List<Petitions> transformToPojo(List<PetitionsDto> dtos) throws ParseException {
		List<Petitions> listaPojo = new ArrayList<>();

		if (dtos != null && !dtos.isEmpty()) {
			for (PetitionsDto dto : dtos) {
				listaPojo.add(transformToPojo(dto));
			}
		}

		return listaPojo;

	}

	@Override
	public Set<PetitionsDto> transformSetToDto(Set<Petitions> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Petitions> transformSetToPojo(Set<PetitionsDto> dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<PetitionsDto> transformToDto(Page<Petitions> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Petitions> transformToPojo(Page<PetitionsDto> dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
