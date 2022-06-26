package com.paruk.tests;

import com.paruk.elements.Table;
import com.paruk.enums.EHobbies;
import com.paruk.enums.EModules;
import com.paruk.enums.EMonth;
import com.paruk.enums.ESubForms;
import com.paruk.pages.MainPage;
import com.paruk.pages.PageWithMenu;
import com.paruk.pages.StartForm;
import com.paruk.pages.StudentRegistrationForm;
import com.paruk.settings.BaseTest;
import com.paruk.settings.Helper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StudentRegistrationFormTests extends BaseTest {

    private MainPage mainPage;
    private PageWithMenu pageWithMenu;


    @Test
    public void inputAllValidData() {

        mainPage = new MainPage(driver);

        mainPage.open();

        mainPage.navigateToModule(EModules.FORMS);

        pageWithMenu = new StartForm(driver);

        Assertions.assertEquals("https://demoqa.com/forms", pageWithMenu.getUrl());

        pageWithMenu.findForm(EModules.FORMS, ESubForms.PRACTICEFORM);

        pageWithMenu = new StudentRegistrationForm(driver);

        StudentRegistrationForm studentRegistrationForm = (StudentRegistrationForm) pageWithMenu;

        Helper.zoomOut(4);

        studentRegistrationForm.fillFirstName("Andrey")
                .fillLastName("Parail")
                .fillEmailAddress("parail200111@gmail.com")
                .selectMale()
                .fillMobileNumber("0939710529")
                .addSubject("Maths")
                .addSubject("English")
                .selectHobbie(EHobbies.MUSIC)
                .fillCurrentAddress("Darova hahaha")
                .selectPicture("D:\\Intern\\demoqa-autotests\\src\\main\\resources\\топ фотка.jpg")
                .selectMonthYearDay(EMonth.MARCH, 1995, 13)
                .selectStateAndCity("Haryana", "Karnal")
                .clickSubmit();

        Table table = new Table(driver);
        System.out.println(table.findValueByKey("Date of Birth"));
        Helper.zoomIn(4);
    }
}
