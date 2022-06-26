package com.paruk.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrentAddressField extends PageElement{

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddress;

    public CurrentAddressField(WebDriver driver) {
        super(driver);
    }

    public void fillCurrentAddress(String text) {
        currentAddress.sendKeys(text);
    }
}
