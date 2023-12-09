package com.qxam.auxiliary.driver;

import org.openqa.selenium.WebDriver;

public interface DriverManager {
    void instantiateDriver();
    void quit();
    WebDriver get();
    byte[] takeScreenshot();
}
