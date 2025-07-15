package com.example.ems.controller;

import com.example.ems.projection.EmployeeSummary;
import com.example.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/summary")
    public List<EmployeeSummary> getEmployeeSummaries() {
        return employeeRepository.findAllEmployeeSummaries();
    }
}
