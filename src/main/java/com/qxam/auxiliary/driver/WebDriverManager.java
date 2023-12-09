package com.qxam.auxiliary.driver;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.qxam.auxiliary.driver.factory.DriverFactory;
import com.qxam.config.DataProvider;
import com.qxam.config.TestDataProperties;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

@Slf4j
public class WebDriverManager implements DriverManager {

    private final ThreadLocal<WebDriver> threadWebDriver = new ThreadLocal<>();

    @Override
    public void instantiateDriver() {
        log.info("About to init the new web getDriver instance");
        WebDriverType driverType = WebDriverType.getDriverTypeFromSettings();

        WebDriver driver = DriverFactory.getDriver(driverType);
        driver.manage().window().maximize();

        TestDataProperties properties = DataProvider.get();

        Configuration.browser = driverType.name().toLowerCase();
        Configuration.timeout = properties.waitTimeout();
        Configuration.pageLoadTimeout = properties.pageLoadTimeout();

        WebDriverRunner.setWebDriver(driver);
        threadWebDriver.set(driver);
    }

    @Override
    public void quit() {
        if (Objects.nonNull(threadWebDriver.get())) {
            log.info("Shutting down the getDriver");
            threadWebDriver.get().quit();
        }

    }

    @Override
    public WebDriver get() {
        log.info("Retrieving the getDriver");
        return threadWebDriver.get();
    }

    @Override
    public byte[] takeScreenshot() {
        log.info("Taking screenshot");
        return ((TakesScreenshot) threadWebDriver.get())
                .getScreenshotAs(OutputType.BYTES);
    }
}
