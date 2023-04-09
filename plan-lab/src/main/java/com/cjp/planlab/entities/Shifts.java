package com.cjp.planlab.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="shifts")
public class Shifts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_shifts")
	private Long id;
	
	@Column(name="timeIni")
	private Date timeIni;
	
	@Column(name="timeEnd")	
	private Date timeEnd;
	
	@Column(name="hours")
	private Integer hours;
	
	@ManyToOne
	@JoinColumn(name = "id_employees", nullable = false)
	private Employees employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getTimeIni() {
		return timeIni;
	}

	public void setTimeIni(Date timeIni) {
		this.timeIni = timeIni;
	}

	public Date getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(Date timeEnd) {
		this.timeEnd = timeEnd;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Employees getEmployee() {
		return employee;
	}

	public void setEmployee(Employees employee) {
		this.employee = employee;
	}
	
	
	

}
