package com.qxam.steps;

import com.qxam.pom.HomePage;
import io.qameta.allure.Step;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageSteps extends BaseSteps<HomePage>{

    public HomePageSteps(WebDriver driver) {
        super(HomePage.class, driver);
    }

    @Step
    public void assertBrandingExists() {
        assertTrue(page().getNavbarBrand().isDisplayed());
    }

    @Step
    public void assertBrandName() {
        assertEquals(
                getProperties().brand(),
                page().getBrandText(),
                "Expected brand name to have: " + getProperties().brand());
    }

    @Step
    public void assertFooterExists() {
        assertTrue(page().getCopyright().isDisplayed());
    }

    @Step
    public void assertFooterAuthor() {
        assertTrue(StringUtils.stripAccents(page().getCopyrightText())
                        .contains(getProperties().author()),
                "Expected author name to contain: " + getProperties().author());
    }
}
