package com.paruk.tests;

import com.paruk.enums.EHobbies;
import com.paruk.enums.EModules;
import com.paruk.enums.EMonth;
import com.paruk.enums.ESubForms;
import com.paruk.pages.MainPage;
import com.paruk.pages.PageWithMenu;
import com.paruk.pages.StartForm;
import com.paruk.pages.StudentRegistrationForm;
import com.paruk.settings.BaseTest;
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

        studentRegistrationForm.fillFirstName("Andrey")
                .fillLastName("Parail")
                .fillEmailAddress("parail200111@gmail.com")
                .selectMale()
                .fillMobileNumber("0939710529")
                .addSubject("Maths")
                .selectHobbie(EHobbies.MUSIC)
                .fillCurrentAddress("Darova hahaha")
                .selectMonthYearDay(EMonth.MARCH, 1995, 13);
    }
}
