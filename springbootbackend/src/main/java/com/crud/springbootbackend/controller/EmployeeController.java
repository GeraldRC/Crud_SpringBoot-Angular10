package com.crud.springbootbackend.controller;

import java.util.List;

import com.crud.springbootbackend.model.Employee;
import com.crud.springbootbackend.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    // get all employees

    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }


}
