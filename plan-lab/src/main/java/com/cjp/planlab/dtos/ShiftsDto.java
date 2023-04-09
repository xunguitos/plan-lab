package com.cjp.planlab.dtos;

import java.util.Date;

import com.cjp.planlab.entities.Employees;

public class ShiftsDto {
	
private Long id;
	
	private String timeIni;
	
	private String timeEnd;
	
	private Integer hours;
	
	private EmployeesDto employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTimeIni() {
		return timeIni;
	}

	public void setTimeIni(String timeIni) {
		this.timeIni = timeIni;
	}

	public String getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public EmployeesDto getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeesDto employee) {
		this.employee = employee;
	}
	
	

}
