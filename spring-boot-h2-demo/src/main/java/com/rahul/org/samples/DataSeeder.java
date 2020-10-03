package com.rahul.org.samples;

import com.rahul.org.samples.entities.Employee;
import com.rahul.org.samples.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;
    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee("Rahul","Tomar","test@gmail.com");
        Employee employee1 = new Employee("Reyansh","Tomar","test@gmail.com");
        Employee employee2 = new Employee("Deepti","Tomar","test@gmail.com");
        Employee employee3 = new Employee("Aria","Tomar","test@gmail.com");
        List<Employee> employees = new ArrayList<>();
        employees.add(0,employee);
        employees.add(1,employee1);
        employees.add(2,employee2);
        employees.add(3,employee3);
        employeeService.saveAll(employees);

    }
}
