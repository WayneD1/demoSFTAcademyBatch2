package com.example.FizzBuzzTDD;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRespository employeeRespository;

    public List<Employee> getAllEmployeesThatAreEarningMoreThan(Double amount) {
        return employeeRespository.getAllEmployees().stream().filter(employee -> employee.getSalary() > amount)
                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployeesExceedingAge(int age) {
        return employeeRespository.getAllEmployees().stream().filter(employee -> employee.getAge() > age)
                .collect(Collectors.toList());
    }

    public List<Employee> getAllEmployeesWithMatchingPosition(String position) {
        return null;
    }

    public List<Employee> getEmployeeWithHighestSalary() {
        return null;
    }

}
