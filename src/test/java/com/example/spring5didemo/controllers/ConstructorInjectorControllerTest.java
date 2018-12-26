package com.example.spring5didemo.controllers;

import com.example.spring5didemo.services.GreetingsService;
import com.example.spring5didemo.services.GreetingsServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConstructorInjectorControllerTest {

    private ConstructorInjectorController constructorInjectorController;

    @Before
    public void setUp() {
        GreetingsService gs = new GreetingsServiceImpl();
        constructorInjectorController = new ConstructorInjectorController(gs);
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(constructorInjectorController.sayHello(), GreetingsServiceImpl.HELLO);
    }
}