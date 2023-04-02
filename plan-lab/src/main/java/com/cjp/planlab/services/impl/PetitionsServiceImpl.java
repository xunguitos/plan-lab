package com.cjp.planlab.services.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.cjp.planlab.dtos.PetitionsDto;
import com.cjp.planlab.mapper.PetitionsMapper;
import com.cjp.planlab.repository.PetitionsRepository;
import com.cjp.planlab.services.IPetitionsService;

@Service
public class PetitionsServiceImpl implements IPetitionsService{
	
	@Autowired
	private PetitionsRepository petitionsRepository;
	
	@Autowired
	private PetitionsMapper petitionsMapper;

	@Override
	public List<PetitionsDto> findAllPetitions() {
		return petitionsMapper.transformToDto(petitionsRepository.findAll());
	}

	@Override
	@Modifying
	public PetitionsDto save(PetitionsDto petitionsDto) throws IllegalArgumentException, ParseException{
		return petitionsMapper.transformToDto(petitionsRepository.save(petitionsMapper.transformToPojo(petitionsDto)));
		
	}

	@Override
	@Modifying
	public PetitionsDto update(PetitionsDto petitionDto) throws IllegalArgumentException, ParseException {
		return petitionsMapper.transformToDto(petitionsRepository.save(petitionsMapper.transformToPojo(petitionDto)));
	}

	@Override
	@Modifying
	public void delete(Long id) {
		petitionsRepository.deleteById(id);
	}

}
