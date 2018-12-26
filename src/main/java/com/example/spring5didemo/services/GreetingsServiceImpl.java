package com.example.spring5didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingsServiceImpl implements GreetingsService {

    public static final String HELLO = "Hello there compadre";

    @Override
    public String sayGreeting() {
        return HELLO;
    }
}
