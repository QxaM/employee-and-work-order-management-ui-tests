package com.qxam.auxiliary.driver.factory;

import com.qxam.auxiliary.driver.WebDriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeDriverFactory extends DriverFactory {

  @Override
  protected WebDriver createDriver() {
    EdgeOptions options = new EdgeOptions();
    options.addArguments("--start-maximized");
    options.addArguments("--dns-prefetch-disable");
    options.addArguments("test-type");

    WebDriverManager.getInstance(WebDriverType.EDGE.name()).setup();
    return new EdgeDriver(options);
  }
}
