package com.paruk.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Picture extends PageElement{

    @FindBy(xpath = "//input[@id='uploadPicture']")
    private WebElement fileButton;

    public Picture(WebDriver driver) {
        super(driver);
    }

    public void setFile(String path) {
        fileButton.sendKeys(path);
    }
}
