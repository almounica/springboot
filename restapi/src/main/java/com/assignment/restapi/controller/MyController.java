package com.assignment.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.restapi.entities.Employee;
import com.assignment.restapi.services.EmployeeManagementService;

@RestController
public class MyController {
	@Autowired
	private EmployeeManagementService employeeService;
  
    //get employee
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
    	return this.employeeService.getEmployees();
    }
    //get employee according to id
    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable String employeeId) {
    	return this.employeeService.getEmployee(Integer.parseInt(employeeId));
    }
    //add employee
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
    	return this.employeeService.addEmployee(employee);
    }
    //update employee
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
    	return this.employeeService.updateEmployee(employee);
    }
    
}
