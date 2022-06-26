package com.paruk.pages;

import com.paruk.enums.EModules;
import com.paruk.enums.ESubForms;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class PageWithMenu extends BasePage {

    @FindBy(xpath = "//div[@class='main-header']")
    private WebElement title;

    @FindBy(xpath = "//div[@class='left-pannel']//div[@class='element-group']")
    private List<WebElement> modules;


    public PageWithMenu(WebDriver driver){
        super(driver);
    }

    public String getTitleForm() {
        return title.getText();
    }

    public void findForm(EModules moduleName, ESubForms subModuleName) {
        findModuleByNameAndClick(moduleName);
        findSubModuleByNameAndClick(subModuleName);
    }

    private List<WebElement> getOpenedSubModules(){
        List<WebElement> subModules = wait
                    .until(driver -> driver.findElements(By.xpath("//div[contains(@class, 'element-list collapse show')]//li")));
        return subModules;
    }

    public <E extends EModules>void findModuleByNameAndClick(E moduleName) {
        for (WebElement module : modules) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", module);

            //временная переменная для получения getText() у конкретного модуля
            WebElement seeModule = module.findElement(By.xpath(".//div[contains(@class, 'header-wrapper')]"));

            if (seeModule.getText().trim().equals(moduleName.getName())) {
                if(!module.isEnabled()){
                    module.click();
                }
                break;
            }
        }
    }


    public <E extends ESubForms>void findSubModuleByNameAndClick(E subModuleName) {
        WebElement subModule = getOpenedSubModules().stream()
                .filter(element -> element.getText().equalsIgnoreCase(subModuleName.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such subModule in this module!"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", subModule );
        subModule.click();
    }

}
