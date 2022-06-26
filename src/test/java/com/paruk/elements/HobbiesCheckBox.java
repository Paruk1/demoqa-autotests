package com.paruk.elements;

import com.paruk.enums.EHobbies;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HobbiesCheckBox extends PageElement{

    @FindBy(xpath = "//div[@id='hobbiesWrapper']//div[@class='custom-control custom-checkbox custom-control-inline']")
    private List<WebElement> listOfHobbies;

    public HobbiesCheckBox(WebDriver webdriver) {
        super(webdriver);
    }

    public <E extends EHobbies> void select(E hobbieName) {
        findHobbieByName(hobbieName.getName()).click();
    }
    private WebElement findHobbieByName(String hobbieName) {
        return listOfHobbies.stream().filter(el -> el.getText().trim().equalsIgnoreCase(hobbieName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such hobbie!"));
    }
}
