package com.example.demo.controller;

import com.example.demo.model.EmployeeDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InterviewController {

    @GetMapping("/employeeDetails")
    public List<EmployeeDetails>  getEmployeeDetails() {
        List<EmployeeDetails> employeeDetails = new ArrayList<>();
        employeeDetails.add(new EmployeeDetails("John", "Doe"));
        return employeeDetails;
    }

    @PostMapping("/addEmployee")
    public String addEmployee(EmployeeDetails employeeDetail) {
        List<EmployeeDetails> employeeDetails = new ArrayList<>();
        employeeDetails.add(employeeDetail);
        return "SUCCESS";
    }

}
