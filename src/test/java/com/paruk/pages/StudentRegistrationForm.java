package com.paruk.pages;

import com.paruk.elements.*;
import com.paruk.entity.RegistrationData;
import com.paruk.enums.EHobbies;
import com.paruk.enums.EMonth;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Pattern;


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
    private RegistrationData registrationData;

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
        registrationData = new RegistrationData();
    }

    public StudentRegistrationForm fillFirstName(String firstName) {
        nameFields.fillFirstName(firstName);
        registrationData.setStudentNameText(firstName);
        return this;
    }

    public StudentRegistrationForm fillLastName(String lastName) {
        nameFields.fillLastName(lastName);
        registrationData.setStudentNameText(" " + lastName);
        return this;
    }

    public StudentRegistrationForm fillEmailAddress(String emailAddress) {
        emailField.fillEmail(emailAddress);
        registrationData.setStudentEmailText(emailAddress);
        return this;
    }

    public StudentRegistrationForm selectMale() {
        gender.selectMale();
        registrationData.setGenderText("Male");
        return this;
    }

    public StudentRegistrationForm selectFemale() {
        gender.selectFemale();
        registrationData.setGenderText("Female");
        return this;
    }

    public StudentRegistrationForm selectOther() {
        gender.selectOther();
        registrationData.setGenderText("Other");
        return this;
    }


    public StudentRegistrationForm fillMobileNumber(String number) {
        mobileField.fillMobileNumber(number);
        registrationData.setMobileText(number);
        return this;
    }

    public <E extends EMonth> StudentRegistrationForm selectMonthYearDay(E month, int year, int day) {
        datePicker.selectMonth(month);
        datePicker.selectYear(year);
        datePicker.selectDay(day);
        registrationData.setDateOfBirthText(day + " " + month.getName() + "," + year);
        return this;
    }

    public StudentRegistrationForm addSubject(String subjectName) {
        subjectField.fillSubject(subjectName);

        if(registrationData.getSubjectsText().equals("")) registrationData.setSubjectsText(subjectName);
        else registrationData.setSubjectsText(", " + subjectName);

        return this;
    }

    public <E extends EHobbies> StudentRegistrationForm selectHobbie(E hobbieName) {
        hobbiesCheckBox.select(hobbieName);
        registrationData.setHobbiesText(hobbieName.getName());
        return this;
    }

    public StudentRegistrationForm selectPicture(String path) {
        picture.setFile(path);
        String[] name = path.split(Pattern.quote("\\"));
        for (int i = 0; i < name.length; i++) {
            if (i == name.length - 1) {
                registrationData.setPictureText(name[i]);
            }
        }
        return this;
    }

    public StudentRegistrationForm fillCurrentAddress(String address) {
        currentAddressField.fillCurrentAddress(address);
        registrationData.setAddressText(address);
        return this;
    }

    public StudentRegistrationForm selectStateAndCity(String stateName, String cityName) {
        stateAndCity.selectState(stateName);
        stateAndCity.selectCity(cityName);
        registrationData.setStateAndCityText(stateName + " " + cityName);
        return this;
    }

    public StudentRegistrationForm clickSubmit() {
        btnSubmit.click();
        return this;
    }

    public RegistrationData getRegistrationData() {
        return registrationData;
    }
}
