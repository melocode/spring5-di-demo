package com.example.spring5didemo.controllers;

import com.example.spring5didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectorController {
    private GreetingsService greetingsService;

    @Autowired
    public void setGreetingsService(@Qualifier("setterGreetingService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }
}
