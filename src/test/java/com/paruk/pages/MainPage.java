package com.paruk.pages;

import com.paruk.enums.EModules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
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


    public <E extends EModules> void navigateToModule(E nameModule) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(findModuleByName(nameModule)));
        element.click();
    }

    private <E extends EModules> WebElement findModuleByName(E moduleName) {
        return modulesList.stream()
                .filter(element -> element.getText().equalsIgnoreCase(moduleName.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such module name!"));

    }
}
