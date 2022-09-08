package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ClickGmailVerifyTitle {

    public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String url = "https://www.google.com";
        driver.get(url);

        driver.manage().window().maximize();
        //find Gmail link and click on it
        //driver  .finElement (By.linkText)("Gmail).click();
        // driver.findElement(By.partialLinkText("yahoo")).click(); it will not find
      //  driver.findElement(By.partialLinkText("mail")).click();


        driver.findElement(By.linkText("Gmail")).click();
       //verify title contains / starts with gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Pass : title verification successful");
        }else {
            System.out.println("Fail: gmail title verification");
        }

        driver.navigate().back();
        String  googleExpectedTitle = "Google";
        String googleActTitle = driver.getTitle();

        if(googleActTitle.equals(googleExpectedTitle)){
            System.out.println("pass: verification is passed ");
        }else {
            System.out.println("Fail: Google title verification failed");
        }












    }
}
