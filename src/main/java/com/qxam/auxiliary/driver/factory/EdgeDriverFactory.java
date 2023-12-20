package com.qxam.auxiliary.driver.factory;

import com.qxam.auxiliary.driver.WebDriverType;
import com.qxam.config.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EdgeDriverFactory extends DriverFactory {

  @Override
  protected WebDriver createDriver() throws MalformedURLException {
    EdgeOptions options = new EdgeOptions();
    options.addArguments("--dns-prefetch-disable");
    options.addArguments("--headless");
    options.addArguments("test-type");

    WebDriverManager.getInstance(WebDriverType.EDGE.name()).setup();
    return new RemoteWebDriver(new URL(DataProvider.get().webDriverUrl()), options);
  }
}
