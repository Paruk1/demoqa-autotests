package com.paruk.tests;

import com.paruk.elements.BaseForm;
import com.paruk.elements.StudentRegistrationForm;
import com.paruk.enums.EModules;
import com.paruk.enums.ESubElements;
import com.paruk.enums.ESubForms;
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

        pageWithMenu = new BaseForm(driver);
        //????????????? хочу тут вызвать метод getTitleForm но из-за того что форма наследуется, супер класс не видит его методов
        //так же если создать StudentRegistrationForm , не смогу по ссылке pageWithMenu обратиться к методам этого объекта из-за полиморфизма
        //или нужно отдельно создавать объект формы, но читал что при реализации PageObject нужно работать элементами с помощью страницы.
        pageWithMenu.findForm(EModules.FORMS, ESubForms.PRACTICEFORM);

        Assertions.assertEquals("https://demoqa.com/automation-practice-form", pageWithMenu.getUrl());
    }
}
