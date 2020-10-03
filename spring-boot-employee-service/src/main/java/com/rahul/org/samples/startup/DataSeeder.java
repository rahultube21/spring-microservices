package com.rahul.org.samples.startup;

import com.rahul.org.samples.entities.Employee;
import com.rahul.org.samples.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class DataSeeder implements CommandLineRunner {
    @Autowired
    private EmployeeService employeeService;
    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee("Rahul Tomar",35,"test@gmail.com","SSE");
        Employee employee1 = new Employee("Deepti Tomar",32,"test0@gmail.com","SM");
        Employee employee2 = new Employee("Aria Tomar",7,"test1@gmail.com","ST");
        Employee employee3 = new Employee("Reyansh Tomar",3,"test2@gmail.com","KT");
        List<Employee> employees = new ArrayList<>();
        employees.add(0,employee);
        employees.add(1,employee1);
        employees.add(2,employee2);
        employees.add(3,employee3);
        employeeService.saveAll(employees);

    }
}
