package com.paruk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver webdriver){
        this.driver = webdriver;
        PageFactory.initElements(driver,this);
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
