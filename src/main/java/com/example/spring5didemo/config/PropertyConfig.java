package com.example.spring5didemo.config;

import com.example.spring5didemo.examplebeans.FakeDataSource;
import com.example.spring5didemo.examplebeans.FakeJmsSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    private Environment env;

    @Autowired
    public PropertyConfig(Environment env) {
        this.env = env;
    }

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
        return new FakeDataSource(env.getProperty("data.username"), password, url);
        ///the data.username env variable was also set in the Intellij Edit Configuration for this app.
    }

    @Bean
    FakeJmsSource fakeJmsSource() {
        return new FakeJmsSource(jmsUser, jmsPassword, jmsUrl);
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
