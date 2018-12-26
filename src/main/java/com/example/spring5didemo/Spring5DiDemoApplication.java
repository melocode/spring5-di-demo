package com.example.spring5didemo;

import com.example.spring5didemo.controllers.ConstructorInjectorController;
import com.example.spring5didemo.controllers.MyController;
import com.example.spring5didemo.controllers.PropertyInjectorController;
import com.example.spring5didemo.controllers.SetterInjectorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Spring5DiDemoApplication.class, args);

        MyController myController = ctx.getBean(MyController.class);

        System.out.println(myController.sayGreeting());
        System.out.println(ctx.getBean(PropertyInjectorController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectorController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectorController.class).sayHello());
    }

}

