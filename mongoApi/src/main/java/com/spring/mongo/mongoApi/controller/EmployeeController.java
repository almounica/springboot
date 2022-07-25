package com.spring.mongo.mongoApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.mongoApi.Entity.Employee;
import com.spring.mongo.mongoApi.sevices.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
  @PostMapping("/employees")
 public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
	  Employee save=this.employeeService.save(employee);
	  return ResponseEntity.ok(save);	
}
  @GetMapping("/employees")
  public ResponseEntity<?> getEmployees(){
 	  return ResponseEntity.ok(this.employeeService.findAll());	
 }
}
