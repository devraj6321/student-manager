package com.example.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("hi")
    public String hello() {
        return "Hello";
    }

    @GetMapping("bye")
    public String bye() {
        return "bye";
    }
}
