package com.qxam.steps;

import com.qxam.config.DataProvider;
import com.qxam.config.TestDataProperties;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class OpenPageSteps {

  private final TestDataProperties properties = DataProvider.get();

  private final WebDriver driver;

  @Step
  public HomePageSteps openHomePage() {
    driver.get(properties.baseUrl());
    return new HomePageSteps(driver);
  }
}
