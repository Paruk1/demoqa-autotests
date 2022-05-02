package com.paruk.elements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SubjectField {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='subjectsInput']")
    private WebElement fieldForInput;

    @FindBy(xpath = "//div[@class='subjects-auto-complete__menu-list subjects-auto-complete__menu-list--is-multi css-11unzgr']/div")
    private List<WebElement> listOfSubjects;

    public SubjectField(WebDriver webdriver) {
        this.driver = webdriver;
        PageFactory.initElements(driver,this);
    }

    public void fillSubject(String subjectName){
        fieldForInput.sendKeys(subjectName);
        findSubjectByName(subjectName).click();
    }

    public WebElement findSubjectByName(String subjectName) {
        return listOfSubjects.stream().filter(el -> el.getText().equalsIgnoreCase(subjectName))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such subject!"));
    }


}
