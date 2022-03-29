package com.paruk.elements;

import com.paruk.pages.PageWithMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentRegistrationForm extends BaseForm {

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='gender-radio-1']")
    private WebElement radioButtonMale;

    @FindBy(xpath = "//input[@id='gender-radio-2']")
    private WebElement radioButtonFemale;

    @FindBy(xpath = "//input[@id='gender-radio-3']")
    private WebElement radioButtonOther;

    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")////////////////////
    private WebElement dateOfBirthd;

    @FindBy(xpath = "//div[@id='subjectsContainer']")////////////////////
    private WebElement subjects;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
    private WebElement sportsCheckBox;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-2']")
    private WebElement readingCheckBox;

    @FindBy(xpath = "//input[@id='hobbies-checkbox-3']")
    private WebElement musicCheckBox;

    @FindBy(xpath = "//input[@id='uploadPicture']")
    private WebElement selectPicture;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement currentAddress;

    @FindBy(xpath = "//div[@id='state']")////////////////////
    private WebElement selectState;

    @FindBy(xpath = "//div[@id='city']")////////////////////
    private WebElement selectCity;

    @FindBy(xpath = "//button[@id='submit']")
    private WebElement btnSubmit;

    public StudentRegistrationForm(WebDriver driver){
        super(driver);
    }

    public StudentRegistrationForm fillFirstName(String firstNamex) {
        firstName.sendKeys(firstNamex);
        return this;
    }

    public StudentRegistrationForm fillLastName(String lastname) {
        lastName.sendKeys(lastname);
        return this;
    }

    public StudentRegistrationForm fillEmailAddress(String name) {
        email.sendKeys(name);
        return this;
    }
    public StudentRegistrationForm selectMale() {
        radioButtonMale.click();
        return this;
    }

    public StudentRegistrationForm selectFemale() {
        radioButtonFemale.click();
        return this;
    }

    public StudentRegistrationForm selectOther() {
        radioButtonOther.click();
        return this;
    }

    public StudentRegistrationForm fillMobileNumber(String number) {
        mobileNumber.sendKeys(number);
        return this;
    }

    public StudentRegistrationForm selectSport(){
        sportsCheckBox.click();
        return this;
    }

    public StudentRegistrationForm selectReading(){
        readingCheckBox.click();
        return this;
    }

    public StudentRegistrationForm selectMusic(){
        musicCheckBox.click();
        return this;
    }

    public StudentRegistrationForm selectPicture(){
        selectPicture.click();
        return this;
    }

    public StudentRegistrationForm fillCurrentAddress(String address) {
        currentAddress.sendKeys(address);
        return this;
    }

    public StudentRegistrationForm clickSubmit() {
        btnSubmit.click();
        return this;
    }
}
