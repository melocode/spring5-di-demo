package com.example.spring5didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es") //set property spring.profiles.active=es to pick this one
@Primary
public class PrimarySpanishGreetingService implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Hola - Servicio de Saludo Primario";
    }
}
