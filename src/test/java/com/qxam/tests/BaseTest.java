package com.qxam.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.qxam.auxiliary.driver.DriverManager;
import com.qxam.auxiliary.driver.WebDriverManager;
import com.qxam.config.DataProvider;
import com.qxam.config.TestDataProperties;
import com.qxam.watchers.ScreenshotWatcher;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.RegisterExtension;

public abstract class BaseTest {

    protected static DriverManager driverManager;
    protected static TestDataProperties properties;

    @RegisterExtension
    ScreenshotWatcher screenshotWatcher = new ScreenshotWatcher(driverManager);

    @BeforeAll
    protected static void setupWebDriver() {
        driverManager = new WebDriverManager();
        properties = DataProvider.get();

        driverManager.instantiateDriver();
    }

    @AfterAll
    protected static void tearDownWebDriver(){
        driverManager.quit();
    }
}
