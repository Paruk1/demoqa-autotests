package com.paruk.pages;

import com.paruk.enums.EModules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage {

    @FindBy(xpath = "//div[contains(@class,'card mt-4 top-card')]")
    public List<WebElement> modulesList;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://demoqa.com/");
    }


    public void navigateToModule(EModules nameModule) {
        findModuleByName(nameModule).click();
    }

    private WebElement findModuleByName(EModules moduleName) {
        return modulesList.stream()
                .filter(element -> element.getText().equalsIgnoreCase(moduleName.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such module name!"));

    }
}
