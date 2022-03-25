package com.paruk.tests;

import com.paruk.elements.StudentRegistrationForm;
import com.paruk.enums.EModules;
import com.paruk.pages.MainPage;
import com.paruk.pages.PageWithMenu;
import com.paruk.settings.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest extends BaseTest {

    private MainPage mainPage;
    private PageWithMenu pageWithMenu;


    @Test
    public void clickOnForms() {
        mainPage = new MainPage(driver);

        mainPage.open();

        mainPage.navigateToModule(EModules.ELEMENTS);

        pageWithMenu = new StudentRegistrationForm(driver);

        pageWithMenu.findForm(EModules.ELEMENTS,"Web Tables");

        Assertions.assertEquals("https://demoqa.com/webtables", pageWithMenu.getUrl());
    }
}
