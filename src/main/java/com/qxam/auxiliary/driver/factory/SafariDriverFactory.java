package com.qxam.auxiliary.driver.factory;

import com.qxam.auxiliary.driver.WebDriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

public class SafariDriverFactory extends DriverFactory {

    @Override
    protected WebDriver createDriver() {
        SafariOptions options = new SafariOptions();
        options.setCapability("safari:dnsservice", false);
        options.setCapability("safari.options", "start-fullscreen");

        WebDriverManager.getInstance(WebDriverType.SAFARI.name()).setup();
        return new SafariDriver(options);
    }
}
