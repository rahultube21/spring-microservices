package com.rahul.org.samples.controllers;

import com.rahul.org.samples.entities.Employee;
import com.rahul.org.samples.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping(value = "/employees"
            ,produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();

    }
}
