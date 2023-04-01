package com.cjp.planlab.dtos;

import java.util.List;

public class PetitionsDto {
	
	private Long id;
	
	private String reason;
	
	private String message;
	
	private List<String> days;

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

	public List<String> getDays() {
		return days;
	}

	public void setDays(List<String> days) {
		this.days = days;
	}
	
	

}
