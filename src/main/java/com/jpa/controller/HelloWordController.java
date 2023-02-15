package com.jpa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWordController {

    @RequestMapping("hello")
    public String sayHello() {
        return "Hello word";
    }
}
