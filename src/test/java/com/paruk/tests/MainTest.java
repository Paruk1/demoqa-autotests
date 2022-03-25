package com.paruk.tests;

import com.paruk.enums.EModules;
import com.paruk.pages.FormsPage;
import com.paruk.pages.MainPage;
import com.paruk.settings.WebDriverSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class MainTest extends WebDriverSettings {

    private MainPage mainPage;
    private FormsPage formsPage;


    @Test
    public void clickOnForms() {
        mainPage = new MainPage(driver);

        mainPage.open();

        formsPage = mainPage.navigateToModule(EModules.FORMS);

        formsPage.showModule(EModules.ELEMENTS,"Web Tables");

        Assertions.assertEquals("https://demoqa.com/webtables", formsPage.getUrl());
    }
}
