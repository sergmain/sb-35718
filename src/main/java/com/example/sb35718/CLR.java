package com.example.sb35718;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Moritz Halbritter
 */
@Component
@EnableConfigurationProperties(TestAppProperties.class)
class CLR implements CommandLineRunner {
    private final ApplicationContext context;
    private final TestAppProperties properties;

    CLR(ApplicationContext context, TestAppProperties properties) {
        this.context = context;
        this.properties = properties;
    }

    @Override
    public void run(String... args) {
        System.out.println(this.properties.getHome());
        System.exit(SpringApplication.exit(context, ()->0));
    }
}
