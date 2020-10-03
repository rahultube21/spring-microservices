package com.rahul.org.samples.service;

import com.rahul.org.samples.entities.Employee;

import java.util.List;

public interface EmployeeService {

    public Iterable<Employee> getAllEmployees();
    public Iterable saveAll(List<Employee> employee);
}
