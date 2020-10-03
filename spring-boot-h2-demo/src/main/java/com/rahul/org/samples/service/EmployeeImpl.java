package com.rahul.org.samples.service;

import com.rahul.org.samples.entities.Employee;
import com.rahul.org.samples.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Iterable<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Iterable saveAll(List<Employee> employee) {
        return employeeRepository.saveAll(employee);
    }
}
