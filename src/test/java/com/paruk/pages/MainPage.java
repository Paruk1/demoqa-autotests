package com.paruk.pages;

import com.paruk.elements.FormsList;
import com.paruk.enums.EModules;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private FormsList formsList;

    public MainPage(WebDriver driver) {
        super(driver);
        formsList = new FormsList(driver);
    }

    public void open() {
        driver.get("https://demoqa.com/");
    }


    public FormsPage navigateToModule(EModules nameModule) {
        formsList.click(nameModule);
        return new FormsPage(driver);
    }

}
