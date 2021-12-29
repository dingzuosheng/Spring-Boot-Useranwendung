package com.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLOutput;

@Controller
public class MainController {
    @GetMapping("")
    public String showHomePage(){
        System.out.println("main controller");
        return "index";
    }
}
