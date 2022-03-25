package com.paruk.pages;


import com.paruk.elements.Menu;
import com.paruk.enums.EModules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Please select an item from left to start practice.')]")
    private WebElement textToContinue;

    private Menu menu;


    public FormsPage(WebDriver driver) {
        super(driver);
        menu = new Menu(driver);

    }

    public void showModule(EModules moduleName, String subModuleName){
        menu.findForm(moduleName,subModuleName);
    }

    public boolean isOpened(){
        return textToContinue.isDisplayed();
    }


}
