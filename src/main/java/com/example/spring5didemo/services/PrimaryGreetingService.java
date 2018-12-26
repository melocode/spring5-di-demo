package com.example.spring5didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary  //spring picks this bean as primary when there's many of the same type
@Profile({"en","default"}) //set property spring.profiles.active=en to pick this one or blank since it's the default profile
public class PrimaryGreetingService implements GreetingsService {

    @Override
    public String sayGreeting() {
        return "Hello -- Primary Greeting Service";
    }
}
