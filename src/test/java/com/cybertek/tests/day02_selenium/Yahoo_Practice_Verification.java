package com.cybertek.tests.day02_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice_Verification {
    public static void main(String[] args) {
        WebDriverManager .chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.yahoo.com");

        // verification
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("PASS: title verification successful");
        } else {
            System.out.println("FAIL: title verification failed");
        }



        System.out.println(" ExpectedTitle " + expectedTitle);
        System.out.println("actualTitle " + actualTitle);

        driver.close();




    }
}
