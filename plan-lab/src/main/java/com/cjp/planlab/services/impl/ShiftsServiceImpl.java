package com.cjp.planlab.services.impl;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import com.cjp.planlab.dtos.ShiftsDto;
import com.cjp.planlab.mapper.ShiftsMapper;
import com.cjp.planlab.repository.ShiftRepository;
import com.cjp.planlab.services.IShiftsService;

@Service
public class ShiftsServiceImpl implements IShiftsService{
	
	@Autowired
	private ShiftRepository shiftRepository;
	
	@Autowired
	private ShiftsMapper shiftMapper;

	@Override
	public List<ShiftsDto> findAllShifts() {
		return shiftMapper.transformToDto(shiftRepository.findAll());
	}

	@Override
	@Modifying
	public ShiftsDto save(ShiftsDto shiftsDto) throws IllegalArgumentException, ParseException {
		return shiftMapper.transformToDto(shiftRepository.save(shiftMapper.transformToPojo(shiftsDto)));
	}

	@Override
	@Modifying
	public ShiftsDto update(ShiftsDto shiftsDto) throws IllegalArgumentException, ParseException {
		return shiftMapper.transformToDto(shiftRepository.save(shiftMapper.transformToPojo(shiftsDto)));
	}

	@Override
	@Modifying
	public void delete(Long id) {
		shiftRepository.deleteById(id);
	}

}
