package com.rahul.org.samples.services;

import com.rahul.org.samples.entities.Employee;
import com.rahul.org.samples.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees() {
        Iterable<Employee> employees =employeeRepository.findAll();
        return StreamSupport
                .stream(employees.spliterator(), false)
                .collect(Collectors.toList());
    }
    @Override
    public List<Employee> saveAll(List<Employee> employees) {
        Iterable<Employee> employeeIterable =employeeRepository.saveAll(employees);
        return StreamSupport
                .stream(employeeIterable.spliterator(), false)
                .collect(Collectors.toList()) ;
    }
}
