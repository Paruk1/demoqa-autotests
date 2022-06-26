package com.paruk.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NameFields extends PageElement{

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    public NameFields(WebDriver driver) {
        super(driver);
    }

    public void fillFirstName(String text){
        this.firstName.sendKeys(text);
    }

    public void fillLastName(String text){
        this.lastName.sendKeys(text);
    }
}
