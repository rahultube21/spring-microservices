package com.rahul.org.samples.controllers;

import com.rahul.org.samples.entities.Employee;
import com.rahul.org.samples.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping(value = "/greetings")
    public String getEmployees(){
        return "Greeting";
    }

    @GetMapping(value = "/employees", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }
    @PostMapping (value = "/employees",consumes = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Employee> getAllEmployee(@RequestBody List<Employee> employee) {
        return employeeService.saveAll(employee);
    }
}
