package ru.teamscore.java23.springdemo.employees.service;

import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    public String getDepartmentName(String employeeId) {
        System.out.println(this + ": getDepartmentName");
        return "Accounts";
    }
}
