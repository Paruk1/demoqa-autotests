package com.paruk.elements;

import com.paruk.enums.EMonth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class DatePicker extends PageElement{

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    private WebElement dateTextField;

    private Select selectMonth;
    private Select selectYear;

    @FindBy(xpath = "//div[@class='react-datepicker__month']/div/div")
    private List<WebElement> days;

    public DatePicker(WebDriver driver){
        super(driver);
    }

    public <E extends EMonth>void selectMonth(E month){
        dateTextField.click();
        selectMonth = new Select(getDriver().findElement(By.className("react-datepicker__month-select")));
        selectMonth.selectByVisibleText(month.getName());
    }

    public void selectYear(int year){
        selectYear = new Select(getDriver().findElement(By.className("react-datepicker__year-select")));
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
