package com.mongo.SpringBootApi.repository;

import com.mongo.SpringBootApi.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
    List<Employee> findByName(String name);
}
