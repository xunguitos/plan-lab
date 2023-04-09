package com.cjp.planlab.mapper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.cjp.planlab.dtos.PetitionsDto;
import com.cjp.planlab.dtos.VacancesDto;
import com.cjp.planlab.entities.Petitions;
import com.cjp.planlab.entities.Vacances;

@Component
public class VacancesMapper implements ModelMapper<Vacances, VacancesDto>{

	@Override
	public VacancesDto transformToDto(Vacances entity) {
		SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
		VacancesDto dto = new VacancesDto ();
		
		if(entity != null) {
			dto.setId(entity.getId());
			dto.setInitDate (formato.format(entity.getInitDate()));
			dto.setFinishDate(formato.format(entity.getFinishDate()));
			dto.setTotalDays(entity.getTotalDays());
		
		}
		return dto;
	}

	@Override
	public Vacances transformToPojo(VacancesDto dto) throws ParseException {
		Vacances entity = new Vacances ();
		SimpleDateFormat formato = new SimpleDateFormat ("dd/MM/yyyy");
		
		if (dto != null) {
			entity.setId(dto.getId());
			entity.setInitDate(formato.parse(dto.getInitDate()));
			entity.setFinishDate(formato.parse(dto.getFinishDate()));
			entity.setTotalDays(dto.getTotalDays());
		}
		return entity;
	}

	@Override
	public List<VacancesDto> transformToDto(List<Vacances> entities) {
		List<VacancesDto> listDto = new ArrayList<>();
		
		if (entities != null && !entities.isEmpty()) {
			for (Vacances entity : entities) {
				listDto.add(transformToDto(entity));
			}
			
		}
		return listDto;
	}

	@Override
	public List<Vacances> transformToPojo(List<VacancesDto> dtos) throws ParseException {
		List<Vacances> listPojo = new ArrayList<>();

		if (dtos != null && !dtos.isEmpty()) {
			for (VacancesDto dto : dtos) {
				listPojo.add(transformToPojo(dto));
			}
		}

		return listPojo;
	}

	@Override
	public Set<VacancesDto> transformSetToDto(Set<Vacances> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Set<Vacances> transformSetToPojo(Set<VacancesDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<VacancesDto> transformToDto(Page<Vacances> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<Vacances> transformToPojo(Page<VacancesDto> dto) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}
	

}
