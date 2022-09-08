package com.cybertek.tests.day10_dropdown_alert_iframes_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CarGurusUsedCarSearchTest {

    String url = "https://www.cargurus.com";
    WebDriver driver ; // we can use in every method

    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
    @AfterClass
    public void tearDown(){ // after class close the browser when done with task done
        driver.quit();
    }
        @Test
        public void verifyTitle(){
            //verify title
            String expectedTitle = "Buy & Sell Cars: Reviews, Prices, and Financing - CarGurus";
            Assert.assertEquals(driver.getTitle(), expectedTitle);

        }
        @Test
    public void selectCar(){
            Select make = new Select(driver.findElement(By.id("carPickerUsed_makerSelect")));
            make.selectByVisibleText("Toyota");
            //make.deselectByIndex(22);
            //make.selectByValue("m7");

           Select model = new Select(driver.findElement(By.id("carPickerUsed_modelSelect")));
           model.selectByValue("d308");

            WebElement enterZipCode = driver.findElement(By.name("zip"));
            enterZipCode.sendKeys("12185");


            //print currently selected options of make and model


            System.out.println("Selected Make : " + make.getFirstSelectedOption().getText());
            System.out.println("Selected Make : " + model.getFirstSelectedOption().getText());

            WebElement clickSearch = driver.findElement(By.cssSelector("input[value='Search']"));
            clickSearch.click();

            WebElement searchResult = driver.findElement(By.xpath("//span[@class='oKvYB4']/strong[2]"));
            System.out.println(searchResult.getText());

            //assert that count is more than 0
            int count = Integer.parseInt(searchResult.getText());
            Assert.assertTrue(count > 0);  // AssertTrue(boolean expression)

        }


    }

/*



 */



