package com.cjp.planlab.dtos;

import java.util.Date;
import java.util.List;

import com.cjp.planlab.entities.Employees;

public class PetitionsDto {
	
	private Long id;
	
	private String reason;
	
	private String message;
	
	private List<Date> days;
	
	private EmployeesDto employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Date> getDays() {
		return days;
	}

	public void setDays(List<Date> days) {
		this.days = days;
	}

	public EmployeesDto getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeesDto employee) {
		this.employee = employee;
	}

}
