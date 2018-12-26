package com.example.spring5didemo.controllers;


import com.example.spring5didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController implements GreetingsService  {

    private GreetingsService greetingsService;

    @Autowired //no need for qualifier since it will pick the @Primary
    public MyController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    @Override
    public String sayGreeting() {
        return greetingsService.sayGreeting();
    }
}
