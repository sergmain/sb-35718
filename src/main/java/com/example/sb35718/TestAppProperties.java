package com.example.sb35718;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Moritz Halbritter
 */
@ConfigurationProperties(prefix = "mh")
public class TestAppProperties {
    private String home;

    public String getHome() {
        return this.home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
