package com.assignment.restapi.services;

import java.util.List;

import com.assignment.restapi.entities.Employee;

public interface EmployeeManagementService {
   public List<Employee> getEmployees();
   public Employee getEmployee(int employeeId);
   public Employee addEmployee(Employee employee);
   public Employee updateEmployee(Employee employee);
   
}
