package com.example.employee.employee.controller;
import com.example.employee.employee.models.Employee;
import com.example.employee.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    //  INDEX
    @GetMapping(value="/employee")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    //  Note the use of {} for browser info, the @PathVariable to convert the passed in info to a Long id
    //  SHOW (by ID)
    @GetMapping(value="/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }
}
