package com.cybertek.tests.Task4_faker;
import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class SmartBear extends SmartBearBase {
    @Test
    public void linkVerification(){
        WebElement userName = driver.findElement(By.name("ctl00$MainContent$username"));
        userName.sendKeys("Tester");
        WebElement passWord = driver.findElement(By.name("ctl00$MainContent$password"));
        passWord.sendKeys("test");
        WebElement login = driver.findElement(By.name("ctl00$MainContent$login_button"));login.click();

         List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("links.size() = " + links.size());

        for(WebElement each : links){
            System.out.println("each.getText() = " + each.getText());
        }
    }
    
}

