package com.example.spring5didemo.config;

import com.example.spring5didemo.services.GreetingRepository;
import com.example.spring5didemo.services.GreetingServiceFactory;
import com.example.spring5didemo.services.GreetingsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
        return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary  //spring picks this bean as primary when there's many of the same type
    @Profile({"en", "default"})
    //set property spring.profiles.active=en to pick this one or blank since it's the default profile
    public GreetingsService primaryGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile({"de"})
    public GreetingsService primaryGermanGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("de");
    }

    @Bean
    @Primary
    @Profile({"es"})
    public GreetingsService primarySpanishGreetingService(GreetingServiceFactory factory) {
        return factory.createGreetingService("es");
    }
}
