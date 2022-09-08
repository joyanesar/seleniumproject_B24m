package com.cybertek.tests.day06_css_clear;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_CSS_Practice {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        String url =  "https://www.amazon.com";
        driver.get(url);
        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
        // autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0"
        // aria-label="Search">
        //WebElement type = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchFiled = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        //WebElement search = driver.findElement(By.cssSelector(("input[aria ='aria-label']")));
        WebElement searchButton = driver.findElement(By.cssSelector("input[value='Go']"));

        searchFiled.sendKeys("wooden spoon");
        searchFiled.click();


        /*
        Page refreshes at this point
        We need to locate the elements again in order ot use them
        so we need to repeat steps
         */
        //Clear the search input box then search for "iphone 13 case"
        searchFiled.clear();

        searchFiled = driver.findElement(By.cssSelector("input[name='field-keywords']"));
        searchButton = driver.findElement(By.cssSelector("input[value='Go']"));

        searchFiled.sendKeys("iphone 13 case");
        searchButton.click();


        Thread.sleep(1000);
        driver.quit();


    }
}
