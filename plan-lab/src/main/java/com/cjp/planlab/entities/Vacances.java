package com.cjp.planlab.entities;

import java.util.Date;

public class Vacances {
	
	private Long id;
	
	private Date initDate;
	
	private Date finishDate;
	
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
