package com.example.sb35718;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Moritz Halbritter
 */
@Component
@EnableConfigurationProperties(TestAppProperties.class)
class CLR implements CommandLineRunner {
    private final TestAppProperties properties;

    CLR(TestAppProperties properties) {
        this.properties = properties;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(this.properties.getHome());
    }
}
