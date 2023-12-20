package com.qxam.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.qxam.pom.HomePage;
import io.qameta.allure.Step;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

public class HomePageSteps extends BaseSteps<HomePage> {

  public HomePageSteps(WebDriver driver) {
    super(HomePage.class, driver);
  }

  @Step
  public void assertBrandingExists() {
    assertTrue(page().getNavbarBrand().isDisplayed());
  }

  @Step
  public void assertBrandName() {
    assertTrue(
        page().getBrandText().contains(getProperties().brand()),
        "Expected brand name to have: " + getProperties().brand());
  }

  @Step
  public void assertFooterExists() {
    assertTrue(page().getCopyright().isDisplayed());
  }

  @Step
  public void assertFooterAuthor() {
    assertTrue(
        StringUtils.stripAccents(page().getCopyrightText()).contains(getProperties().author()),
        "Expected author name to contain: " + getProperties().author());
  }
}
