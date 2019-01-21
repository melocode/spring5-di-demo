package com.example.spring5didemo;

import com.example.spring5didemo.controllers.ConstructorInjectorController;
import com.example.spring5didemo.controllers.MyController;
import com.example.spring5didemo.controllers.PropertyInjectorController;
import com.example.spring5didemo.controllers.SetterInjectorController;
import com.example.spring5didemo.examplebeans.FakeDataSource;
import com.example.spring5didemo.examplebeans.FakeJmsSource;
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


        //data source with externalize properties
        FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
        System.out.println("\nfakeDataSource.getUser() = " + fakeDataSource.getUser());

        FakeJmsSource fakeJmsSource = ctx.getBean(FakeJmsSource.class);
        System.out.println("fakeJmsSource.getUsername() = " + fakeJmsSource.getUsername());

    }

}

