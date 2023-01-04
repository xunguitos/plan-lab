package com.cjp.planlab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjp.planlab.entities.Employees;

public interface EmployeesRepository extends JpaRepository<Long, Employees> {

}
