package com.cjp.planlab.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Vacances {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name= "id_vacances")
	private Long id;
	
	@Column (name="initDate")
	private Date initDate;
	
	@Column (name = "finishDate")
	private Date finishDate;
	
	@Column (name = "totalDays")
	private Long totalDays;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getInitDate() {
		return initDate;
	}

	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public Long getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(Long totalDays) {
		this.totalDays = totalDays;
	}
	
	

}
