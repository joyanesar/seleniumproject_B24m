package com.cybertek.tests.day08_implicitwait_checkbox_radio_testing;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class EtsyRadioCheckBoxTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = "https://www.etsy.com";
        driver.manage().window().maximize();
        //This will wait upto 10 seconds while finding element
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        //search for wooden spoon
        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("wooden spoon" + Keys.ENTER);

        //click on All filters
        WebElement clickAllFilters = driver.findElement(By.id("search-filter-button"));
        clickAllFilters.click();

        // select
        WebElement freeShipping = driver.findElement(By.xpath("//label[@for='special-offers-free-shipping']"));
        freeShipping.click();

        WebElement onSale = driver.findElement(By.xpath("//label[@for='special-offers-on-sale']"));
        onSale.click();

        WebElement under25$ = driver.findElement(By.xpath("//label[@for='price-input-1']"));
        under25$.click();


        WebElement apply = driver.findElement(By.xpath("//button[@form='search-filter-form']"));
        apply.click();

        WebElement result = driver.findElement(By.xpath("//span[contains(text(),'results,')]"));
        System.out.println("Result =" + result.getText());

        driver.quit();
    }
}
