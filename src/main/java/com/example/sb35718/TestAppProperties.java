package com.example.sb35718;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;

import java.nio.file.Path;

/**
 * @author Moritz Halbritter
 */
@ConfigurationProperties(prefix = "mh")
public class TestAppProperties {
    private Path home;

    private final Environment env;

    public TestAppProperties(Environment env) {
        this.env = env;
    }

    public Path getHome() {
        return this.home;
    }

    public void setHome(Path home) {
        this.home = home;
    }
}
