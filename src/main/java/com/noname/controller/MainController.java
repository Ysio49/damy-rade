package com.noname.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String mainController(Model model) {
        model.addAttribute("atrybut","mainController");
        return "index";
    }

    @RequestMapping("/job-search")
    public String goToJobSearch(Model model) {
        model.addAttribute("atrybut","goToJobSearch");
        return "job-search";
    }




}
