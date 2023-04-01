package com.cjp.planlab.mapper;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.cjp.planlab.dtos.PetitionsDto;
import com.cjp.planlab.entities.Petitions;

@Component
public class PetitionsMapper implements ModelMapper<Petitions, PetitionsDto>{

	@Override
	public PetitionsDto transformToDto(Petitions entity) {
		PetitionsDto dto = new PetitionsDto();
		if(entity != null) {
			dto.setId(entity.getId());
			dto.setMessage(entity.getMessage());
			dto.setReason(entity.getReason());
			dto.setDays(entity.getDays());
		}
		return dto;
	}

	@Override
	public Petitions transformToPojo(PetitionsDto dto) throws ParseException {
		Petitions entity = new Petitions();
		if(dto != null) {
			entity.setId(dto.getId());
			entity.setMessage(dto.getMessage());
			entity.setReason(dto.getReason());
			entity.setDays(dto.getDays());
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
