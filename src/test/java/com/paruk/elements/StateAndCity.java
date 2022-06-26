package com.paruk.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.List;

public class StateAndCity extends PageElement{

    @FindBy(xpath = "//input[@id='react-select-3-input']")
    private WebElement stateButton;

    @FindBy(xpath = "//div[@id='city']")
    private WebElement cityButton;

    public StateAndCity(WebDriver driver) {
        super(driver);
    }

    public void selectState(String state) {
        stateButton.sendKeys(state);

        List<WebElement> stateList = getDriver().findElements(By.xpath("//div[@id='state']//div[@class=' css-26l3qy-menu']/div//div"));
        WebElement stateElement = getWait().until(ExpectedConditions.elementToBeClickable(findByTextName(state, stateList)));

        stateElement.click();
    }

    public void selectCity(String city) {
        cityButton.click();

        List<WebElement> cityList = getDriver().findElements(By.xpath("//div[@id='city']//div[@class=' css-26l3qy-menu']/div//div"));

        WebElement cityElement = getWait().until(ExpectedConditions.elementToBeClickable(findByTextName(city, cityList)));

        cityElement.click();
    }

    private WebElement findByTextName(String name, List<WebElement> webElements) {
        return webElements.stream().filter(el -> el.getText().trim().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such name!"));
    }

}
