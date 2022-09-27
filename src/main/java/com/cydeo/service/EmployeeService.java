package com.cydeo.service;

import com.cydeo.module.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeService {

    public static List<Employee> employeeList=new ArrayList<>();
    public void saveEmployee(Employee employee){
        employeeList.add(employee);

    }

    public static List<Employee> readEmployees() {

        return employeeList;
    }


}
