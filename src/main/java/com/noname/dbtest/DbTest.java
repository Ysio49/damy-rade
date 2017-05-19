package com.noname.dbtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;


public class DbTest {

    private EmployeeRepository employeeRepository;


    public DbTest(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


}
