package com.example.springbootgradledemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String Hello(){
        return "This is my first java Spring Boot application";
    }
}
