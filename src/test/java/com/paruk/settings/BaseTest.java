package com.paruk.settings;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    protected ChromeOptions options;

    @BeforeAll
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "D:\\Intern\\demoqa-autotests\\src\\main\\resources\\chromedriver.exe");
        options = new ChromeOptions().addArguments("start-maximized");
    }

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // в селениум 4
    }

    @AfterEach
    public void close() {
        //driver.close();
    }
}
