package com.cjp.planlab.services;

import java.text.ParseException;
import java.util.List;

import com.cjp.planlab.dtos.PetitionsDto;

public interface IPetitionsService {

	List<PetitionsDto> findAllPetitions();

	PetitionsDto save(PetitionsDto petitionsDto) throws IllegalArgumentException, ParseException;


}
