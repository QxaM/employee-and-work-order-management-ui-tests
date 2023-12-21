package com.qxam.auxiliary.driver;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;

public interface DriverManager {
  void instantiateDriver() throws MalformedURLException;

  void quit();

  WebDriver get();

  byte[] takeScreenshot();
}
