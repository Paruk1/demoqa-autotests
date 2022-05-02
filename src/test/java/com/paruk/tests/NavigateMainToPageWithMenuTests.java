package com.paruk.tests;

import com.paruk.pages.StartForm;
import com.paruk.enums.EModules;
import com.paruk.pages.MainPage;
import com.paruk.pages.PageWithMenu;
import com.paruk.settings.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class NavigateMainToPageWithMenuTests extends BaseTest {

    private MainPage mainPage;
    private PageWithMenu pageWithMenu;


    @Test
    public void clickOnElements() {
        mainPage = new MainPage(driver);

        mainPage.open();

        mainPage.navigateToModule(EModules.ELEMENTS);

        pageWithMenu = new StartForm(driver);

        Assertions.assertEquals("https://demoqa.com/elements", pageWithMenu.getUrl());
    }
    @Test
    public void clickOnForms() {
        mainPage = new MainPage(driver);

        mainPage.open();

        mainPage.navigateToModule(EModules.FORMS);

        pageWithMenu = new StartForm(driver);

        Assertions.assertEquals("https://demoqa.com/forms", pageWithMenu.getUrl());
    }

    @Test
    public void clickOnAlertsFrameWindows() {
        mainPage = new MainPage(driver);

        mainPage.open();

        mainPage.navigateToModule(EModules.ALERTSFRAMEWINDOWS);

        pageWithMenu = new StartForm(driver);

        Assertions.assertEquals("https://demoqa.com/alertsWindows", pageWithMenu.getUrl());
    }

    @Test
    public void clickOnBookStoreApplication() {
        mainPage = new MainPage(driver);

        mainPage.open();

        mainPage.navigateToModule(EModules.BOOKSTOREAPPLICATION);

        pageWithMenu = new StartForm(driver);

        Assertions.assertEquals("https://demoqa.com/books", pageWithMenu.getUrl());
    }

    @Test
    public void clickOnInteractions() {
        mainPage = new MainPage(driver);

        mainPage.open();

        mainPage.navigateToModule(EModules.INTERACTIONS);

        pageWithMenu = new StartForm(driver);

        Assertions.assertEquals("https://demoqa.com/interaction", pageWithMenu.getUrl());
    }

    @Test
    public void clickOn() {
        mainPage = new MainPage(driver);

        mainPage.open();

        mainPage.navigateToModule(EModules.WIDGETS);

        pageWithMenu = new StartForm(driver);

        Assertions.assertEquals("https://demoqa.com/widgets", pageWithMenu.getUrl());
    }
}
