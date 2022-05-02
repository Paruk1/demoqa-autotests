package com.paruk.pages;

import com.paruk.pages.PageWithMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartForm extends PageWithMenu {

    @FindBy(xpath = "//*[contains(text(),'Please select an item from left to start practice.')]")
    private WebElement textToStartPractice;

    public StartForm(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getTitleForm(){
        return textToStartPractice.getText();
    }
}
