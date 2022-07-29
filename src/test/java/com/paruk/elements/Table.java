package com.paruk.elements;

import com.paruk.entity.RegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table extends PageElement {

    @FindBy(xpath = "//table[@class='table table-dark table-striped table-bordered table-hover']")
    private WebElement table;


    public Table(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getRows() {
        List<WebElement> rows = table.findElements(By.xpath(".//tbody//tr"));
        return rows;
    }

    public Map<String, String> getMappedElements() {
        List<WebElement> rows = getRows();
        Map<String, String> mapList = new HashMap<>();

        for (WebElement row : rows) {
            String key = row.findElement(By.xpath(".//td[1]")).getText();
            String value = row.findElement(By.xpath(".//td[2]")).getText();
            mapList.put(key, value);
        }
        return mapList;
    }

    public String findValueByKey(String key) {
        Map<String, String> map = getMappedElements();
        return map.get(key);
    }

    public RegistrationData getTableData() {
        RegistrationData tableData = new RegistrationData();
        tableData.setStudentNameText(findValueByKey("Student Name"));
        tableData.setStudentEmailText(findValueByKey("Student Email"));
        tableData.setGenderText(findValueByKey("Gender"));
        tableData.setMobileText(findValueByKey("Mobile"));
        tableData.setDateOfBirthText(findValueByKey("Date of Birth"));
        tableData.setSubjectsText(findValueByKey("Subjects"));
        tableData.setHobbiesText(findValueByKey("Hobbies"));
        tableData.setPictureText(findValueByKey("Picture"));
        tableData.setAddressText(findValueByKey("Address"));
        tableData.setStateAndCityText(findValueByKey("State and City"));
        return tableData;
    }
}
