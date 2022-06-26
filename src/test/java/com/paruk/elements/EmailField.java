package com.paruk.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

public class EmailField extends PageElement{

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement email;

    public EmailField(WebDriver driver) {
        super(driver);
    }

    public void fillEmail(String text) {
        email.sendKeys(text);
    }
}
