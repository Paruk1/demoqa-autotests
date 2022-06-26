package com.paruk.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileField extends PageElement{

    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement mobileNumber;

    public MobileField(WebDriver driver) {
        super(driver);
    }

    public void fillMobileNumber(String text) {
        mobileNumber.sendKeys(text);
    }
}
