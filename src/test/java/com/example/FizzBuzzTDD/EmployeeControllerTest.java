package com.example.FizzBuzzTDD;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeControllerTest {


    EmployeeController employeeController = new EmployeeController();

    @Test
    @DisplayName("Given a request, " +
            "EmployeeController should " +
            "execute Service")
    public void name() {
        //arrange
        Double salary = 13000d;

        //act
        List<Employee> employeeList = employeeController.getEmployeesExceedingSalary(salary);

        //assert

    }
}
