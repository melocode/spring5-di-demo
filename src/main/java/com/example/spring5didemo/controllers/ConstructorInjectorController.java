package com.example.spring5didemo.controllers;

import com.example.spring5didemo.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectorController {
    private GreetingsService greetingsService;

    @Autowired //Unnecessary annotation, but good for readability.  Newer Spring autowires constructors automatically.
    public ConstructorInjectorController(@Qualifier("constructorGreetingService") GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String sayHello() {
        return greetingsService.sayGreeting();
    }
}
