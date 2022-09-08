package com.cybertek.tests.day03_locators_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC4_GoogleSearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.com";
        driver.get(url);
        //This command let you type word int search box
        driver.findElement(By.name("q")).sendKeys("apple");
        Thread.sleep(2000);
        //This command search auto
        driver.findElement(By.name("btnK")).click();

        String actTitle = driver.getTitle();
        String expTitle = "apple";

        if(actTitle.startsWith(expTitle)){
            System.out.println("Passed verification");
        }else {
            System.out.println("Failed Verification");
        }


        driver.navigate().back();

        driver.findElement(By.name("q")).sendKeys("etsy");
        Thread.sleep(1000);
        driver.findElement(By.name("btnK")).click();


        driver.quit();

    }
}
