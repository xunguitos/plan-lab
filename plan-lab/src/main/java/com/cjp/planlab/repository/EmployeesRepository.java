package com.cjp.planlab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjp.planlab.entities.Employees;

public interface EmployeesRepository extends JpaRepository<Employees, Long> {

	public List<Employees> findAll();
}
