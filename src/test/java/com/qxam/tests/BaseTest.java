package com.qxam.tests;

import static org.junit.jupiter.api.Assertions.fail;

import com.qxam.auxiliary.driver.DriverManager;
import com.qxam.auxiliary.driver.WebDriverManager;
import com.qxam.config.DataProvider;
import com.qxam.config.TestDataProperties;
import com.qxam.watchers.ScreenshotWatcher;
import java.net.MalformedURLException;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.RegisterExtension;

@Slf4j
public abstract class BaseTest {

  protected static DriverManager driverManager;
  protected static TestDataProperties properties;

  @RegisterExtension ScreenshotWatcher screenshotWatcher = new ScreenshotWatcher(driverManager);

  @BeforeAll
  protected static void setupWebDriver() {
    driverManager = new WebDriverManager();
    properties = DataProvider.get();

    try {
      driverManager.instantiateDriver();
    } catch (MalformedURLException e) {
      log.error("Malformed URL when creating webdriver: " + e.getCause());
      fail();
    }
  }

  @AfterAll
  protected static void tearDownWebDriver() {
    driverManager.quit();
  }
}
