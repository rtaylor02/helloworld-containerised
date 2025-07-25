package com.javarchitect.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/")
@CrossOrigin
public class HelloController {
    @Value("${name}")
    private String appEnv;

    @GetMapping({"", "greeting"})
    public String greet() {
        return "Hello there, " + appEnv ;
    }
}
