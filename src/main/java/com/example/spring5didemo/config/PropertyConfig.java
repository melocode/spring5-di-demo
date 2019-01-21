package com.example.spring5didemo.config;

import com.example.spring5didemo.examplebeans.FakeDataSource;
import com.example.spring5didemo.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
/*@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})*/
//COMMENT out these PropertSources so as to use the default application.properties file instead.
public class PropertyConfig {

    @Value("${data.username}")
    String user;

    @Value("${data.password}")
    String password;

    @Value("${data.dburl}")
    String url;

    @Value("${jms.username}")
    String jmsUser;

    @Value("${jms.password}")
    String jmsPassword;

    @Value("${jms.url}")
    String jmsUrl;

    @Bean
    FakeDataSource fakeDataSource() {
        return new FakeDataSource(user, password, url);
        ///the data.username property was also set in the Intellij Edit Configuration for this app under Environment
    }

    @Bean
    FakeJmsSource fakeJmsSource() {
        return new FakeJmsSource(jmsUser, jmsPassword, jmsUrl);
    }


    //no longer needed if using the default Spring Boot application.properties file
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
}
