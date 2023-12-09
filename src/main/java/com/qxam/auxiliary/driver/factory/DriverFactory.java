package com.qxam.auxiliary.driver.factory;

import com.qxam.auxiliary.driver.WebDriverType;
import org.openqa.selenium.WebDriver;

public abstract class DriverFactory {

    public static WebDriver getDriver(String driver) {
        return switch (WebDriverType.valueOf(driver)) {
            case CHROME -> new ChromeDriverFactory().createDriver();
            case FIREFOX -> new FirefoxDriverFactory().createDriver();
            case EDGE -> new EdgeDriverFactory().createDriver();
            case SAFARI -> new SafariDriverFactory().createDriver();
        };
    }

    protected abstract WebDriver createDriver();
}
