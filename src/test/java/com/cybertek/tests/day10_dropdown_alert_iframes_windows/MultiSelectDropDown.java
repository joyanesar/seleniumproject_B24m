package com.cybertek.tests.day10_dropdown_alert_iframes_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultiSelectDropDown {
    String url = "http://practice.cybertekschool.com/dropdown";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);


    }
    @Test
    public void SelectMultipleLanguageTest() throws InterruptedException {
        Select languages = new Select(driver.findElement(By.name("Languages")));
        languages.selectByVisibleText("Java");
        languages.selectByVisibleText("JavaScript");
        languages.selectByVisibleText("Python");

        System.out.println("Language . isMultiple() = " + languages.isMultiple()); // this print if its multiple or not
        Thread.sleep(1234);
        //Un check all selected options
        languages.deselectAll();
        Thread.sleep(1234);
        // using for loop
        for(WebElement each : languages.getOptions()){
            each.click();
        }

        driver.quit();


    }
}