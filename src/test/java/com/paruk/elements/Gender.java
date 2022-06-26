package com.paruk.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Gender extends PageElement{

    @FindBy(xpath = "//div[@class='custom-control custom-radio custom-control-inline'][1]")
    private WebElement radioButtonMale;

    @FindBy(xpath = "//input[@id='gender-radio-2']")
    private WebElement radioButtonFemale;

    @FindBy(xpath = "//input[@id='gender-radio-3']")
    private WebElement radioButtonOther;

    public Gender(WebDriver driver) {
        super(driver);
    }

    public void selectMale() {
        radioButtonMale.click();
    }

    public void selectFemale() {
        radioButtonFemale.click();
    }

    public void selectOther() {
        radioButtonOther.click();
    }
}
