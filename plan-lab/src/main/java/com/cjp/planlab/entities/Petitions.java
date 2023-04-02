package com.cjp.planlab.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "petitions")
public class Petitions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_petitions")
	private Long id;
	
	@Column(name="reason")
	private String reason;
	
	@Column(name = "message")
	private String message;
	
	@Column(name = "days")
	@ElementCollection
	private List<Date> days;
	
	@ManyToOne
	@JoinColumn(name = "id_employees", nullable = false)
	private Employees employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Date> getDays() {
		return days;
	}

	public void setDays(List<Date> days) {
		this.days = days;
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

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}

}
