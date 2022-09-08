package com.cybertek.tests.day10_dropdown_alert_iframes_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HandlingAlertsTest {
    String url = "http://practice.cybertekschool.com/javascript_alerts";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void jsAlertsTest(){
        //click on information / warning alert link
        WebElement infoAlertLink = driver.findElement(By.xpath("//*[.='Click for JS Alert']"));
        infoAlertLink.click();
        //switch to alert and click on Ok
        Alert infoAlert = driver.switchTo().alert();
        System.out.println("Text of alert = " + infoAlert.getText());
        infoAlert.accept(); // click ok

    }
    @Test
    public void confirmAlertTest() throws InterruptedException {
        WebElement confirmAlert = driver.findElement(By.xpath("//*[.='Click for JS Confirm']"));
        confirmAlert.click();
        Thread.sleep(123);
        Alert alert = driver.switchTo().alert(); // click on cancel button
        System.out.println("Text of alert : " + alert.getText());

        Assert.assertEquals(alert.getText(), "I am a JS Confirm");
        alert.dismiss();


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
