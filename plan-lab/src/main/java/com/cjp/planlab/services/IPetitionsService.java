package com.cjp.planlab.services;

import java.util.List;

import com.cjp.planlab.dtos.PetitionsDto;

public interface IPetitionsService {

	List<PetitionsDto> findAllPetitions();


}
