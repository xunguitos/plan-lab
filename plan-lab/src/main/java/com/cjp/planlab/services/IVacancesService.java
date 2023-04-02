package com.cjp.planlab.services;

import java.text.ParseException;
import java.util.List;

import com.cjp.planlab.dtos.VacancesDto;

public interface IVacancesService {

	VacancesDto save (VacancesDto vacancesDto) throws IllegalArgumentException, ParseException;

	List<VacancesDto> findAllVacances();

	VacancesDto update(VacancesDto vacancesDto)throws IllegalArgumentException, ParseException;

	void deleteVacances(Long id);

}
