package com.example.jenkinsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsDemoController {

    @GetMapping("/")
    public String hello(){
        return "Welcome to Jenkins";
    }

    @GetMapping("/hello")
    public String world(){
        return "Hello World";
    }

    @GetMapping("/world")
    public String helloWorld(){
        return "Hello World";
    }
}
