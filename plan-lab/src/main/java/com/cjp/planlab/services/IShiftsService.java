package com.cjp.planlab.services;

import java.text.ParseException;
import java.util.List;

import com.cjp.planlab.dtos.ShiftsDto;

public interface IShiftsService {

	List<ShiftsDto> findAllShifts();

	ShiftsDto save(ShiftsDto shiftsDto) throws IllegalArgumentException, ParseException;;

	ShiftsDto update(ShiftsDto shiftsDto) throws IllegalArgumentException, ParseException;;

	void delete(Long id);

}
