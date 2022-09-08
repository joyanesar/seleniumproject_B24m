package com.cybertek.tests.day04_locators_getattribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager .chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:www.google.com");


        //Locate the search field and assign to WebElement variable
        WebElement searchField= driver.findElement(By.name("q")); //WebElement , it represent single element
        //on the page. We can find the element using findElement method then assign it to WebElement variable

        System.out.println("class value = " + searchField.getAttribute("class"));
        System.out.println("max length " + searchField.getAttribute("maxlength"));
        searchField.sendKeys("iphone 13 pro" , Keys.ENTER);
        //driver.findElement(By.name("btnK")).click();
        // read the value that is in the search field
        System.out.println("Current value " + searchField.getAttribute("value"));
        Thread.sleep(2000);
        driver.quit();

    }
}
