package com.qxam.steps;

import com.qxam.config.DataProvider;
import com.qxam.config.TestDataProperties;
import io.qameta.allure.Step;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RequiredArgsConstructor
public class BaseSteps<T> {

    private final Class<T> type;

    private final WebDriver driver;

    public T page() {
        return PageFactory.initElements(driver, type);
    }

    protected TestDataProperties getProperties() {
        return DataProvider.get();
    }

    @Step
    public void assertCurrentPageUrl(String expectUrl, String messageOnFail) {
        assertTrue(driver.getCurrentUrl().contains(expectUrl),
                messageOnFail);
    }
}
