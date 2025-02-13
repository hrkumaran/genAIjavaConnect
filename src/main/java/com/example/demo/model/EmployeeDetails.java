package com.example.demo.model;

import java.util.Objects;

public class EmployeeDetails {

    private String employeeName;
    private String employeePrice;


    public EmployeeDetails(String employeeName, String employeePrice) {
        this.employeeName = employeeName;
        this.employeePrice = employeePrice;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDetails that = (EmployeeDetails) o;
        return Objects.equals(employeeName, that.employeeName) && Objects.equals(employeePrice, that.employeePrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeName, employeePrice);
    }
}
