package com.cybertek.tests.day07_findElements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        String appUrl = "http://practice.cybertekschool.com/forgot_password";
        driver.get(appUrl);
        //find all links and store into list of webelements
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //print all links
        System.out.println("count of links = " + links.size());


        //print text of first one
        System.out.println("First link = " + links.get(0).getText());

        //print text of second one
        System.out.println("Second link = " + links.get(1).getText());

        //print last link
        System.out.println("Last link =  " + links.get(links.size()-1).getText());

        //Loop and print href value of each one
        // shortcut for loop
        //iter -> enter or tab
        for (WebElement link : links) {
            System.out.println(link.getAttribute("href"));
            
        }

        //click on Home link at index

        links.get(1).click();

        Thread.sleep(8000);

        driver.quit();


    }
}
