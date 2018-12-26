package com.example.spring5didemo.controllers;

import com.example.spring5didemo.services.GreetingsServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PropertyInjectorControllerTest {

    PropertyInjectorController propertyInjectorController;

    @Before
    public void setUp() {
        propertyInjectorController = new PropertyInjectorController();
        propertyInjectorController.greetingsService = new GreetingsServiceImpl();
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(propertyInjectorController.sayHello(), GreetingsServiceImpl.HELLO);

    }
}