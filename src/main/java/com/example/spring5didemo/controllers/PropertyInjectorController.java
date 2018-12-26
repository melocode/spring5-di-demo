package com.example.spring5didemo.controllers;

import com.example.spring5didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    @Autowired
    @Qualifier("greetingsServiceImpl")
    public GreetingsService greetingsService;


    public String sayHello() {
        return greetingsService.sayGreeting();
    }
}
