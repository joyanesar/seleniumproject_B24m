package com.cybertek.tests.Task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LittleCaesars {
    public static void main(String[] args) {

        String url = "https://www.google.com";
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
        Actions actions = new Actions(driver);


        WebElement escapeNoThanks = driver.findElement(By.xpath("//div[@class='QlyBfb']/button[@aria-label='No thanks']"));

        actions.click(escapeNoThanks);
//        WebElement littleCaesars = driver.findElement(By.id("q"));
//        littleCaesars.sendKeys("Little Caesars");

        //driver.quit();








    }
}
