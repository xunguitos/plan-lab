package com.cjp.planlab.dtos;

import java.sql.Date;

public class VacancesDto {

	private Long id;
	
	private Date initDate;
	
	private Date finishDate;
	
	private Long totalDays;


	public Long getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(Long totalDays) {
		this.totalDays = totalDays;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}

	public Date getInitDate() {
		return initDate;
	}

	public void setInitDate(Date initDate) {
		this.initDate = initDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
