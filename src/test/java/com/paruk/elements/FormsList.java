package com.paruk.elements;

import com.paruk.enums.EModules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormsList {


    @FindBy(xpath = "//div[contains(@class,'card mt-4 top-card')]")
    public List<WebElement> modulesList;

    public WebDriver driver;


    public FormsList(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void click(EModules moduleName) {
        findModuleByText(moduleName.getName()).click();
    }

    private WebElement findModuleByText(String moduleName) {
       return modulesList.stream()
                .filter(element -> element.getText().toLowerCase().equals(moduleName.toLowerCase()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such module name!"));

    }

}
