package com.mongo.SpringBootApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="Employee")
public class Employee {
    @Id
    private int id;
    private String name;
    private long salary;
    private String designation;
}
