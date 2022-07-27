package com.mongo.SpringBootApi.service;

import com.mongo.SpringBootApi.dto.EmployeeDto;
import com.mongo.SpringBootApi.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(EmployeeDto employeeDto);
    Employee getEmployeeById(int id);
    List<Employee> getEmployeeListByName(String name);
    Employee updateEmployee(EmployeeDto employeeDto);
    void deleteEmployeeById(int id);
}
