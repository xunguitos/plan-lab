package com.cjp.planlab.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;

import com.cjp.planlab.dtos.EmployeesDto;
import com.cjp.planlab.dtos.PetitionsDto;
import com.cjp.planlab.dtos.ShiftsDto;
import com.cjp.planlab.entities.Employees;
import com.cjp.planlab.entities.Petitions;
import com.cjp.planlab.entities.Shifts;

@Configuration
public class ShiftsMapper implements ModelMapper<Shifts, ShiftsDto>{

	@Override
	public ShiftsDto transformToDto(Shifts entity) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		ShiftsDto dto = new ShiftsDto();
		
		if(entity != null) {
			dto.setId(entity.getId());
			dto.setHours(entity.getHours());
			dto.setTimeEnd(formato.format(entity.getTimeEnd()));
			dto.setTimeIni(formato.format(entity.getTimeIni()));
			
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
	public Shifts transformToPojo(ShiftsDto dto) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		Shifts entity = new Shifts();
		
		if(dto != null) {
			entity.setId(dto.getId());
			entity.setHours(dto.getHours());
			entity.setTimeEnd(formato.parse(dto.getTimeEnd()));
			entity.setTimeIni(formato.parse(dto.getTimeIni()));
			
			Employees employee = null;
			if(entity.getEmployee() !=null) {
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
	public List<ShiftsDto> transformToDto(List<Shifts> entities) {
		List<ShiftsDto> listaDto = new ArrayList<>();

		if (entities != null && !entities.isEmpty()) {
			for (Shifts entity : entities) {
				listaDto.add(transformToDto(entity));
			}
		}

		return listaDto;
	}

	@Override
	public List<Shifts> transformToPojo(List<ShiftsDto> dtos) throws ParseException {
		List<Shifts> listaPojo = new ArrayList<>();

		if (dtos != null && !dtos.isEmpty()) {
			for (ShiftsDto dto : dtos) {
				listaPojo.add(transformToPojo(dto));
			}
		}

		return listaPojo;
	}

	@Override
	public Set<ShiftsDto> transformSetToDto(Set<Shifts> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Shifts> transformSetToPojo(Set<ShiftsDto> dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<ShiftsDto> transformToDto(Page<Shifts> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Shifts> transformToPojo(Page<ShiftsDto> dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
