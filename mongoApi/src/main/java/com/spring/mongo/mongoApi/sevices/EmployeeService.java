package com.spring.mongo.mongoApi.sevices;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.mongoApi.Entity.Employee;

public interface EmployeeService extends MongoRepository<Employee,Integer> {

	

}
