package com.example.spring5didemo.services;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de") //set property spring.profiles.active=de to pick this one
@Primary
public class PrimaryGermanGreetingService implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Primäre Begrüßung";
    }
}
