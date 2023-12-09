package com.qxam.auxiliary.driver.factory;

import org.openqa.selenium.WebDriver;

public abstract class DriverFactory {

    public WebDriver driver() {
        return createDriver();
    }

    protected abstract WebDriver createDriver();
}
