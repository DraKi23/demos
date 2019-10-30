package com.drgn.experiments.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/say")
    public String sayHello(){
        return "Hello world!";
    }
}
