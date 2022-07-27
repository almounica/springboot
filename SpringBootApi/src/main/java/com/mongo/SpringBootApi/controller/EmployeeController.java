package com.mongo.SpringBootApi.controller;

import com.mongo.SpringBootApi.dto.EmployeeDto;
import com.mongo.SpringBootApi.model.Employee;
import com.mongo.SpringBootApi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")

public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("add")
    public ResponseEntity<Employee> addEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee=employeeService.createEmployee(employeeDto);
        return ResponseEntity.ok(employee);
    }
    @GetMapping("get")
    public ResponseEntity<Employee> findEmployeeById(@RequestParam("id") Integer id){
        Employee employee=employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }
    @GetMapping("getAll")
    public ResponseEntity<List<Employee>> findEmployeeByName(@RequestParam("name") String name){
        List<Employee> employees=employeeService.getEmployeeListByName(name);
        return ResponseEntity.ok(employees);
    }
    @PutMapping("update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody EmployeeDto employeeDto){
        Employee employee=employeeService.updateEmployee(employeeDto);
        return ResponseEntity.ok(employee);
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteEmployeeById(@RequestParam("id") Integer id){
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok("Employee deleted");
    }
}
