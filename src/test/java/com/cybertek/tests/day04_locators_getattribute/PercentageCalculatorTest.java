package com.cybertek.tests.day04_locators_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PercentageCalculatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.calculator.net/");

        driver.manage().window().maximize();
        // click for percentage calculator
        driver.findElement(By.linkText("Percentage Calculator")).click();

        Thread.sleep(2000);
        String expTitle = "Percentage Calculator";
        String actTitle = driver.getTitle();

        System.out.println("Current title = " + driver.getTitle());
            //Title verification
        if(actTitle.equals(expTitle)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test failed");
        }
            //Enter 20% 120000
        driver.findElement(By.id("cpar1")).sendKeys("20");
        driver.findElement(By.id("cpar2")).sendKeys("120000"); // we can use 12000 , enter 0r 12000 + keyEnter

        // click or enter
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();

        // Print result
        String result = driver.findElement(By.className("h2result")).getText(); // getTex give you text in html

        System.out.println("Result "  + result);
        Thread.sleep(2000);
            // Result is in String type
        if(result.endsWith("24000")){
            System.out.println("Pass Calculation");
        }else {
            System.out.println("Fail Calculation");
        }

        //driver.quit();

    }
}
