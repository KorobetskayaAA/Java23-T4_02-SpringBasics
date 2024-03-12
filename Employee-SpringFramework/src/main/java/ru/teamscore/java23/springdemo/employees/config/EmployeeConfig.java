package ru.teamscore.java23.springdemo.employees.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ru.teamscore.java23.springdemo.employees.service.DepartmentService;
import ru.teamscore.java23.springdemo.employees.service.EmployeeService;

@Configuration
@ComponentScan("ru.teamscore.java23.springdemo.employees.service")
public class EmployeeConfig {
/*    @Bean
    public DepartmentService departmentService() {
        return new DepartmentService();
    }

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeService(departmentService());
    }
    */
}
