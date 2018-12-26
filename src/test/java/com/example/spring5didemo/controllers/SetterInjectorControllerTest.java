package com.example.spring5didemo.controllers;

import com.example.spring5didemo.services.GreetingsServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SetterInjectorControllerTest {

    SetterInjectorController setterInjectorController;

    @Before
    public void setUp() {
        setterInjectorController = new SetterInjectorController();
        setterInjectorController.setGreetingsService(new GreetingsServiceImpl());
    }

    @Test
    public void sayHello() {
        Assert.assertEquals(setterInjectorController.sayHello(), GreetingsServiceImpl.HELLO);
    }
}