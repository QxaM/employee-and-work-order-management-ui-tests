package com.qxam.auxiliary.driver.factory;

import com.qxam.auxiliary.driver.WebDriverType;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;

public abstract class DriverFactory {

  public static WebDriver getDriver(WebDriverType driver) throws MalformedURLException {
    return switch (driver) {
      case CHROME -> new ChromeDriverFactory().createDriver();
      case FIREFOX -> new FirefoxDriverFactory().createDriver();
      case EDGE -> new EdgeDriverFactory().createDriver();
      case SAFARI -> new SafariDriverFactory().createDriver();
    };
  }

  protected abstract WebDriver createDriver() throws MalformedURLException;
}
