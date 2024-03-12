package ru.teamscore.java23.springdemo.employees;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.teamscore.java23.springdemo.employees.config.EmployeeConfig;
import ru.teamscore.java23.springdemo.employees.service.DepartmentService;
import ru.teamscore.java23.springdemo.employees.service.EmployeeService;

// Source: https://dev.to/ashertoqeer/java-spring-framework-dependency-injection-without-spring-boot-1acl
public class Application {

    /*
    //NO SPRING
    public static void main(String[] args) {
        DepartmentService departmentService = new DepartmentService();
        EmployeeService employeeService = new EmployeeService(departmentService);
        System.out.println(employeeService.checkDepartment());
    }
    /*/
    // USE SPRING DEPENDENCY INJECTION
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(
                EmployeeConfig.class
        );

        EmployeeService employeeService = context.getBean(EmployeeService.class);
        System.out.println(employeeService.checkDepartment());
    }
    //*/
}