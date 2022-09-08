package com.cybertek.tests.Task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsySearch {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager .chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        String url = "https://www.etsy.com";

        driver.get(url);
        driver.findElement(By.name("search_query")).sendKeys("wooden spoon");


        String expTitle = "wooden spoon";
        String actTitle = driver.getTitle();
        String result = "";

        if(actTitle.equals(expTitle)){

            result = "passed";

        }else {
            result = "failed";
        }


        Thread.sleep(2000);
        System.out.println(result);
        System.out.println("Title " + actTitle);
        System.out.println("Url " + url);




    }
}
