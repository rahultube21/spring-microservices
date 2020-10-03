package com.rahul.org.samples.services;

import com.rahul.org.samples.entities.Employee;
import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployees();
    public List<Employee> saveAll(List<Employee> employees);
}
