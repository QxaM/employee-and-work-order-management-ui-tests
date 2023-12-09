package com.qxam.pom;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class BasePage {

    @FindBy(className = "navbar-brand")
    private WebElement navbarBrand;

    @FindBy(className = "copyright")
    private WebElement copyright;

    public String getBrandText() {
        return navbarBrand.getText();
    }

    public String getCopyrightText() {
        return copyright.getText();
    }
}
