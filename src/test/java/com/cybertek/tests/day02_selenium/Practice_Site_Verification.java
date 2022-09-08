package com.cybertek.tests.day02_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Site_Verification {
    public static void main(String[] args) {
        /*
        2ndTC #2: Cybertek practice tool verifications
    1. Open Chrome browser
    2. Go to https://practice.cybertekschool.com/
    3. Verify URL contains
    Expected: cybertekschool
    4. Verify title:
    Expected: Practice
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //make browser full screen / maximize
        driver.manage().window().maximize(); // this is called method chaining
        driver.get("http://practice.cybertekschool.com");

        String currentUrl = driver.getCurrentUrl(); // it gives us the url
        String title = driver.getTitle(); // it gives us title

        if(currentUrl.contains("cybertekschool")){
            System.out.println("Pass : url verification");
        }else {
            System.out.println("Fail: Url verification failed");
        }

        if(title.equals("Practice")){
            System.out.println("Pass : Title verification");
        }else {
            System.out.println("Fail: Title verification");
        }

        driver.quit();

    }
}
