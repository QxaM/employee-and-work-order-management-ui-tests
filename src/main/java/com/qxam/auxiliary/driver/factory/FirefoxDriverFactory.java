package com.qxam.auxiliary.driver.factory;

import com.qxam.auxiliary.driver.WebDriverType;
import com.qxam.config.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FirefoxDriverFactory extends DriverFactory {

  @Override
  protected WebDriver createDriver() throws MalformedURLException {
    FirefoxOptions options = new FirefoxOptions();
    options.addArguments("-browser");
    options.addArguments("-headless");
    options.addPreference("Network.dns.disablePrefetch", true);

    WebDriverManager.getInstance(WebDriverType.FIREFOX.name()).setup();
    return new RemoteWebDriver(new URL(DataProvider.get().webDriverUrl()), options);
  }
}
