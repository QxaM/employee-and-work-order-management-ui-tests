package com.qxam.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:env", "system:properties", "classpath:application.properties"})
public interface TestDataProperties extends Config {
    String browserType();
    long pageLoadTimeout();
    long waitTimeout();
    String baseUrl();
    String brand();
    String author();
}
