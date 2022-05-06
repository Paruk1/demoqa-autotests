package com.paruk.elements;

import com.paruk.enums.EHobbies;
import com.paruk.enums.EMonth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DatePicker {

    private WebDriver driver;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    private WebElement dateTextField;

    private Select selectMonth;
    private Select selectYear;

    @FindBy(xpath = "//div[@class='react-datepicker__month']/div/div")
    private List<WebElement> days;

    public DatePicker(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public <E extends EMonth>void selectMonth(E month){
        dateTextField.click();
        selectMonth = new Select(driver.findElement(By.className("react-datepicker__month-select")));
        selectMonth.selectByVisibleText(month.getName());
    }

    public void selectYear(int year){
        selectYear = new Select(driver.findElement(By.className("react-datepicker__year-select")));
        selectYear.selectByValue(String.valueOf(year));
    }

    public void selectDay(int day){
        findDayByName(String.valueOf(day)).click();
    }

    private WebElement findDayByName(String day) {
        return this.days.stream().filter(el -> el.getText().trim().equalsIgnoreCase(day))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such day!"));
    }
}
