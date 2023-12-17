package com.qxam.auxiliary.driver.factory;

import com.qxam.auxiliary.driver.WebDriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverFactory extends DriverFactory {

  @Override
  protected WebDriver createDriver() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    options.addArguments("--dns-prefetch-disable");
    options.addArguments("--headless");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("test-type");

    System.setProperty("webdriver.chrome.driver", "./usr/local/bin/chromedriver.exe");

    WebDriverManager.getInstance(WebDriverType.CHROME.name()).setup();
    return new ChromeDriver(options);
  }
}
