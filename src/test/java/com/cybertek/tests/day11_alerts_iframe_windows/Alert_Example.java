package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;

public class Alert_Example {
    String url = "http://practice.cybertekschool.com/javascript_alerts";
    WebDriver driver; // we can use in every method

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);

    }
    @Test
    public void infoAlertTest() {
        WebElement jsAlert = driver.findElement(By.xpath("//*[.='Click for JS Alert']"));
        jsAlert.click();
        Alert infoAlert1 = driver.switchTo().alert();
        System.out.println("Text of Alert = " + infoAlert1.getText());
        assertEquals(infoAlert1.getText(), "I am a JS Alert");
        infoAlert1.accept();
        //resultMsg
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("resultMsg.getTex() " + result.getText());
        assertEquals(result.getText(), "You successfully clicked an alert");
    }
    @Test
    public void confirmAlertTest() {
        WebElement jsConfirm = driver.findElement(By.xpath("//*[.='Click for JS Confirm']"));
        jsConfirm.click();

        Alert infoAlert2 = driver.switchTo().alert();
        System.out.println("Confirm Text of Alert = " + infoAlert2.getText());
        assertEquals(infoAlert2.getText(), "I am a JS Confirm");
        infoAlert2.dismiss();
        //result massage
        WebElement resultMsg = driver.findElement(By.id("result"));
        System.out.println("resultMsg.getText() = " + resultMsg.getText());
        assertEquals(resultMsg.getText(), "You clicked: Cancel");

    }
    @Test
        public void jsPromptTest(){
        WebElement jsPrompt = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
        jsPrompt.click();

        Alert infoAlert3 = driver.switchTo().alert();
        System.out.println("Text of Alert = " + infoAlert3.getText());
        assertEquals(infoAlert3.getText(),"I am a JS prompt");
        //enter "hello" and click on ok
        infoAlert3.sendKeys("hellohello");
        infoAlert3.accept();
        //resultMsg
        WebElement result = driver.findElement(By.id("result"));
        System.out.println("resultMsg is  " + result.getText());
        assertEquals(result.getText(), "You entered: hellohello");

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}