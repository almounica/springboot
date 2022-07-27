package com.mongo.SpringBootApi.impl;

import com.mongo.SpringBootApi.dto.EmployeeDto;
import com.mongo.SpringBootApi.model.Employee;
import com.mongo.SpringBootApi.repository.EmployeeRepository;
import com.mongo.SpringBootApi.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepo;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee createEmployee(EmployeeDto employeeDto) {
        Employee employee= new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }

    @Override
    public List<Employee> getEmployeeListByName(String name) {
        return employeeRepo.findByName(name);

    }

    @Override
    public Employee updateEmployee(EmployeeDto employeeDto) {
        Employee employee= getEmployeeById(employeeDto.getId());
        BeanUtils.copyProperties(employeeDto, employee);
        return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployeeById(int id) {
        employeeRepo.deleteById(id);
    }
}
