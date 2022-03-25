package com.paruk.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbstractForm {

    private WebDriver driver;

    @FindBy(xpath = "//div[@class='main-header']")
    private WebElement title;

    public AbstractForm(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public AbstractForm() {

    }

    public String getTitleForm() {
        return title.getText();
    }
}
