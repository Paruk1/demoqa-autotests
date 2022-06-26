package com.paruk.pages;

import com.paruk.elements.*;
import com.paruk.enums.EHobbies;
import com.paruk.enums.EMonth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class StudentRegistrationForm extends PageWithMenu {

    private NameFields nameFields;
    private EmailField emailField;
    private Gender gender;
    private MobileField mobileField;
    private DatePicker datePicker;
    private SubjectField subjectField;
    private HobbiesCheckBox hobbiesCheckBox;
    private Picture picture;
    private CurrentAddressField currentAddressField;
    private StateAndCity stateAndCity;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btnSubmit;

    public StudentRegistrationForm(WebDriver driver) {
        super(driver);
        nameFields = new NameFields(driver);
        emailField = new EmailField(driver);
        gender = new Gender(driver);
        mobileField = new MobileField(driver);
        subjectField = new SubjectField(driver);
        hobbiesCheckBox = new HobbiesCheckBox(driver);
        datePicker = new DatePicker(driver);
        currentAddressField = new CurrentAddressField(driver);
        stateAndCity = new StateAndCity(driver);
        picture = new Picture(driver);
    }

    public StudentRegistrationForm fillFirstName(String firstName) {
        nameFields.fillFirstName(firstName);
        return this;
    }

    public StudentRegistrationForm fillLastName(String lastName) {
        nameFields.fillLastName(lastName);
        return this;
    }

    public StudentRegistrationForm fillEmailAddress(String address) {
        emailField.fillEmail(address);
        return this;
    }

    public StudentRegistrationForm selectMale() {
        gender.selectMale();
        return this;
    }

    public StudentRegistrationForm selectFemale() {
        gender.selectFemale();
        return this;
    }

    public StudentRegistrationForm selectOther() {
        gender.selectOther();
        return this;
    }


    public StudentRegistrationForm fillMobileNumber(String number) {
        mobileField.fillMobileNumber(number);
        return this;
    }

    public <E extends EMonth> StudentRegistrationForm selectMonthYearDay(E month, int year, int day) {
        datePicker.selectMonth(month);
        datePicker.selectYear(year);
        datePicker.selectDay(day);
        return this;
    }

    public StudentRegistrationForm addSubject(String subjectName) {
        subjectField.fillSubject(subjectName);
        return this;
    }

    public <E extends EHobbies> StudentRegistrationForm selectHobbie(E hobbieName) {
        hobbiesCheckBox.select(hobbieName);
        return this;
    }

    public StudentRegistrationForm selectPicture(String path) {
        picture.setFile(path);
        return this;
    }

    public StudentRegistrationForm fillCurrentAddress(String address) {
        currentAddressField.fillCurrentAddress(address);
        return this;
    }

    public StudentRegistrationForm selectStateAndCity(String stateName, String cityName) {
        stateAndCity.selectState(stateName);
        stateAndCity.selectCity(cityName);
        return this;
    }

    public StudentRegistrationForm clickSubmit() {
        btnSubmit.click();
        return this;
    }


}
