package com.qxam.tests;

import com.qxam.steps.HomePageSteps;
import com.qxam.steps.OpenPageSteps;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

@Slf4j
public class HomePageTests extends BaseTest {

  private static HomePageSteps homePageSteps;

  @BeforeAll
  public static void openHomePage() {
    // Given User opens home page
    homePageSteps = new OpenPageSteps(driverManager.get()).openHomePage();
  }

  @Test
  void shouldIncludeBrandName() {
    // Given User opens home page

    // When

    // Then Current url is base url
    homePageSteps.assertCurrentPageUrl(
        properties.baseUrl(), "Home page expected to be the current one");
    // Then Page have branding
    homePageSteps.assertBrandingExists();
    // Then Page contains correct brand name
    homePageSteps.assertBrandName();
  }

  @Test
  void shouldIncludeNameInFooter() {
    // Given User opens home page

    // When

    // Then Current url is base url
    homePageSteps.assertCurrentPageUrl(
        properties.baseUrl(), "Home page expected to be the current one");
    // Then Page have branding
    homePageSteps.assertFooterExists();
    // Then Page contains correct brand name
    homePageSteps.assertFooterAuthor();
  }
}
