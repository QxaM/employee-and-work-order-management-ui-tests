package com.qxam.auxiliary.driver.factory;

import com.qxam.auxiliary.driver.WebDriverType;
import com.qxam.config.DataProvider;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeDriverFactory extends DriverFactory {

  @Override
  protected WebDriver createDriver() throws MalformedURLException {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--dns-prefetch-disable");
    options.addArguments("--headless");
    options.addArguments("--no-sandbox");
    options.addArguments("--disable-dev-shm-usage");
    options.addArguments("test-type");

    WebDriverManager.getInstance(WebDriverType.CHROME.name()).setup();
    return new RemoteWebDriver(new URL(DataProvider.get().webDriverUrl()), options);
  }
}
