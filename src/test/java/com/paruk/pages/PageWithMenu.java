package com.paruk.pages;

import com.paruk.enums.EModules;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public abstract class PageWithMenu extends BasePage {

    private WebDriverWait webDriverWait;

    @FindBy(xpath = "//div[@class='main-header']")
    private WebElement title;

    @FindBy(xpath = "//div[@class='left-pannel']//div[@class='element-group']")
    private List<WebElement> modules;


    public PageWithMenu(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getTitleForm() {
        return title.getText();
    }

    public void findForm(EModules moduleName, String subModuleName) {
        findModuleByNameAndClick(moduleName);
        findSubModuleByNameAndClick(subModuleName);
    }

    private List<WebElement> getOpenedSubModules(){
        List<WebElement> subModules = webDriverWait
                    .until(driver -> driver.findElements(By.xpath("//div[contains(@class, 'element-list collapse show')]//li")));
        return subModules;
    }

    public void findModuleByNameAndClick(EModules moduleName) {
        for (WebElement module : modules) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", module);

            //временная переменная для получения getText() у конкретного модуля
            WebElement seeModule = module.findElement(By.xpath(".//div[contains(@class, 'header-wrapper')]"));

            if (seeModule.getText().trim().equals(moduleName.getName())) {
                if(!module.isSelected()){
                    module.click();
                }
                break;
            }
        }
    }


    public void findSubModuleByNameAndClick(String subModuleName) {
        WebElement subModule = getOpenedSubModules().stream()
                .filter(element -> element.getText().toLowerCase().equals(subModuleName.toLowerCase()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such subModule in this module!"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", subModule );
        subModule.click();
    }


}