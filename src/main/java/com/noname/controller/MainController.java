package com.noname.controller;

import com.noname.dbtest.DbTest;
import com.noname.dbtest.Employee;
import com.noname.dbtest.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;

@Controller
public class MainController {

    @RequestMapping("/")
    public String mainController(Model model) {
        model.addAttribute("atrybut","mainController");
        return "index";
    }





}
