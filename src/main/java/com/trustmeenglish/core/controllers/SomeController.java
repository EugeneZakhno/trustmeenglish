package com.trustmeenglish.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("/hellow")
    public String sayHello(){
        return "hello world";
    }

}
