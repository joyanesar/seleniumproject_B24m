package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.tests.day17_upload_js_executor.JavaScriptExecutor;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
   Goto Etsy homepage
Scroll down
Generate random email and enter into subscribe box
Click on Subscribe
Verify "Great! We've sent you an email to confirm your subscription." is displayed
     */
public class EtsySubscribeTest extends TestBase {

    @Test
    public void randomEmailSubscribeTest(){
        driver.get(ConfigurationReader.getProperty("etsy.url"));
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,5000)");
        BrowserUtils.scrollDown(5000);
        WebElement email = driver.findElement(By.name("email_address"));

        email.sendKeys(faker.internet().emailAddress() + Keys.ENTER);
        BrowserUtils.sleep(3);

        WebElement verify = driver.findElement(By.cssSelector("div[class='wt-alert wt-alert--inline wt-alert--success-01 wt-text-body-01']"));
        Assert.assertTrue(verify.isDisplayed());
       Assert.assertEquals(verify.getText(),"Great! We've sent you an email to confirm your subscription.");

        WebElement subscribe = driver.findElement(By.cssSelector("button[type='submit']"));
        subscribe.click();


        
    }

}
