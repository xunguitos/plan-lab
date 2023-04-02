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
public class EmployeesMapper implements ModelMapper<Employees, EmployeesDto>{

	@Override
	public EmployeesDto transformToDto(Employees entity) {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		EmployeesDto dto = new EmployeesDto();
		
		if(entity != null) {
			dto.setId(entity.getId());
			dto.setName(entity.getName());
			dto.setSurname(entity.getSurname());
			dto.setNif(entity.getNif());
			dto.setEmail(entity.getEmail());
			dto.setTelephone(entity.getTelephone());
			
			List<PetitionsDto> petitionsList = new ArrayList<PetitionsDto>();;
			PetitionsDto petitions = null;
			if(!entity.getPetitions().isEmpty() || entity.getPetitions() != null) {
				for(Petitions p : entity.getPetitions()) {
					petitions = new PetitionsDto();
					petitions.setId(p.getId());
					petitions.setMessage(p.getMessage());
					petitions.setReason(p.getReason());
					
					List<String> days = new ArrayList<String>();
					String day = null;
					if(!p.getDays().isEmpty() || p.getDays() != null) {
						for(Date d : p.getDays()) {
							day = new String();
							day = formato.format(d);
							
							days.add(day);
						}
						petitions.setDays(days);
					}
					
					petitionsList.add(petitions);
				}
				
				dto.setPetitions(petitionsList);
			}
			
			
		}
		return dto;
	
	}

	@Override
	public Employees transformToPojo(EmployeesDto dto) throws ParseException {
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Employees entity = new Employees();
		
		if(entity != null) {
			entity.setId(dto.getId());
			entity.setName(dto.getName());
			entity.setSurname(dto.getSurname());
			entity.setNif(dto.getNif());
			entity.setEmail(dto.getEmail());
			entity.setTelephone(dto.getTelephone());
			
			List<Petitions> petitionsList = new ArrayList<Petitions>();;
			Petitions petitions = null;
			if(!dto.getPetitions().isEmpty() || dto.getPetitions() != null) {
				for(PetitionsDto p : dto.getPetitions()) {
					petitions = new Petitions();
					petitions.setId(p.getId());
					petitions.setMessage(p.getMessage());
					petitions.setReason(p.getReason());
					
					List<Date> days = new ArrayList<Date>();
					Date day = null;
					if(!p.getDays().isEmpty() || p.getDays() != null) {
						for(String d : p.getDays()) {
							day = new Date();
							day = formato.parse(d);
							
							days.add(day);
						}
						petitions.setDays(days);
					}
					
					petitionsList.add(petitions);
				}
				
				entity.setPetitions(petitionsList);
			}
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
