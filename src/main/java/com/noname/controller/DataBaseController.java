package com.noname.controller;

import com.noname.dbtest.Employee;
import com.noname.dbtest.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api")
public class DataBaseController {

    @Autowired
    private EmployeeRepository repository;

    @RequestMapping("/test")
    public void testdb() {
        Employee employee = new Employee();
        employee.setFirstName("mskmdksa");
        employee.setLastName("cycki");
        employee.setSalary(new BigDecimal("13000.0"));
        System.out.println("disabled added");
        repository.save(employee);
    }
}
