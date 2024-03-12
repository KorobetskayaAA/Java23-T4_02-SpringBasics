package ru.teamscore.java23.springdemo.employees.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {
    private final DepartmentService departmentService;

    public EmployeeService(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    public String checkDepartment() {
        System.out.println(this + ": checkDepartment");
        return departmentService.getDepartmentName("EMP-0098");
    }
}

