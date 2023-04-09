package com.cjp.planlab.services.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.cjp.planlab.dtos.VacancesDto;
import com.cjp.planlab.mapper.VacancesMapper;
import com.cjp.planlab.repository.VacancesRepository;
import com.cjp.planlab.services.IVacancesService;

@Service
public class VacancesServiceImpl implements IVacancesService {

	@Autowired
	private VacancesRepository vacancesRepository;
	
	@Autowired
	private VacancesMapper vacancesMapper;
	
	@Override
	public VacancesDto save(VacancesDto vacancesDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return vacancesMapper.transformToDto(vacancesRepository.save(vacancesMapper.transformToPojo(vacancesDto)));
	}

	@Override
	public List<VacancesDto> findAllVacances() {
		return vacancesMapper.transformToDto(vacancesRepository.findAll());
	}

	@Override
	@Modifying
	public VacancesDto update(VacancesDto vacancesDto) throws IllegalArgumentException, ParseException {
		// TODO Esbozo de método generado automáticamente
		return vacancesMapper.transformToDto(vacancesRepository.save(vacancesMapper.transformToPojo(vacancesDto)));
	}

	@Override
	public void deleteVacances(Long id) {
		// TODO Esbozo de método generado automáticamente
		vacancesRepository.deleteById(id);
		
	}

}
