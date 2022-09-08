package com.cybertek.tests.day20_iframeActionsTest;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Instant;

public class ExplicitWaitExamples extends TestBase  {

    @Test
    public void testOne(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement triggerButton = driver.findElement(By.xpath("//button[.='Start']"));
        triggerButton.click();
        WebElement userName = driver.findElement(By.id("username"));
        WebDriverWait wait= new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(userName));
        userName.sendKeys("Maxi");
    }
    @Test
    public void Test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        WebElement enAbleDisAbleBtn = driver.findElement(By.xpath("(//button)[2]"));
        enAbleDisAbleBtn.click();

        //the input box visible even without clicking on enable btn
        // the problem is click ability
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@type='text']"))));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys(faker.name().username());
        BrowserUtils.sleep(2);

    }

}
