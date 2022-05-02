package com.paruk.pages;

import com.paruk.elements.HobbiesCheckBox;
import com.paruk.elements.SubjectField;
import com.paruk.enums.EHobbies;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StudentRegistrationForm extends PageWithMenu {

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstName;

    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastName;

    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement email;

    @FindBy(xpath = "//div[@class='custom-control custom-radio custom-control-inline'][1]")
    private WebElement radioButtonMale;

    @FindBy(xpath = "//input[@id='gender-radio-2']")
    private WebElement radioButtonFemale;

    @FindBy(xpath = "//input[@id='gender-radio-3']")
    private WebElement radioButtonOther;

    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement mobileNumber;

    @FindBy(xpath = "//input[@id='dateOfBirthInput']")////////////////////
    private WebElement dateOfBirthd;

    private SubjectField subjectField;

    private HobbiesCheckBox hobbiesCheckBox;

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
        subjectField = new SubjectField(driver);
        hobbiesCheckBox = new HobbiesCheckBox(driver);
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
        webDriverWait.until(ExpectedConditions.elementToBeClickable(radioButtonMale));
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


    public StudentRegistrationForm addSubject(String subjectName) {
        subjectField.fillSubject(subjectName);
        return this;
    }


    public <E extends EHobbies>StudentRegistrationForm selectHobbie(E hobbieName){
        hobbiesCheckBox.select(hobbieName);
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
