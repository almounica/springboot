package com.assignment.restapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.restapi.entities.Employee;
public interface EmployeeDao extends JpaRepository<Employee,Integer> {
	
}
