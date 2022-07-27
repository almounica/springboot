package com.mongo.SpringBootApi.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private int id;
    private String name;
    private long salary;
    private String designation;
}
