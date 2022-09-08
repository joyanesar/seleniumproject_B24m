package com.cybertek.tests.Task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        String url = "https:www.amazon.com";
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone13");
        driver.findElement(By.id("nav-search-submit-button")).click();

       String text =driver.findElement(By.id("a-size-medium a-color-base a-tex-normal")).getText();

       if(text.contains("iphone13")){
           driver.findElement(By.id("a-size-medium a-color-base a-tex-normal")).getText();
       }else {
           System.out.println("There is not iphone 13 in here!");
       }

       
        Thread.sleep(2000);


        driver.quit();


    }

}
