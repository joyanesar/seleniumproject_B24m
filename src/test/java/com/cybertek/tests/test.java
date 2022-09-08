package com.cybertek.tests;

import com.cybertek.utils.ConfigurationReader;
import com.cybertek.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test extends TestBase{
    WebDriver driver;
    @BeforeMethod
    public void test() {
        Driver.getDriver().get(ConfigurationReader.getProperty("lib.url"));

    }
    @Test
            public void login(){

        String getEmail = "librarian12@library";

        String getPass = "AOYKYTMJ";

        WebElement id = driver.findElement(By.id("inputEmail"));
        id.sendKeys(getEmail);
        WebElement pass = driver.findElement(By.id("inputPassword"));
        pass.sendKeys(getPass);

        WebElement log = driver.findElement(By.xpath("//button[@type='submit']"));

        log.click();


    }
}
