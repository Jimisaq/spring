package com.example.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greetUser(){
        return "Hello, welcome to the Simple Web App!";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        return "This is a simple web application built with Spring Boot.";
    }
}
