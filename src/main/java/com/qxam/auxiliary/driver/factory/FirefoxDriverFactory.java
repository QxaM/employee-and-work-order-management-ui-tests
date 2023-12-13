package com.qxam.auxiliary.driver.factory;

import com.qxam.auxiliary.driver.WebDriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxDriverFactory extends DriverFactory {

  @Override
  protected WebDriver createDriver() {
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("-browser");
    options.addPreference("Network.dns.disablePrefetch", true);

    WebDriverManager.getInstance(WebDriverType.FIREFOX.name()).setup();
    return new FirefoxDriver(options);
  }
}
