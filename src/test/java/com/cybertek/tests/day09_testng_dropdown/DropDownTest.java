package com.cybertek.tests.day09_testng_dropdown;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class DropDownTest {
    String url = "http://practice.cybertekschool.com/dropdown";
    WebDriver driver ;

    @BeforeMethod
    public void setUp(){
        System.out.println("Setting Up WebDriver ...");
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void titleTest(){
        System.out.println("Title of the page = " + driver.getTitle());
        assertEquals(driver.getTitle(), "Dropdowns");

    }
    @Test
    public void simpleDropDownTest() {
        //locate Select tag element
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        // creat Select class object
        Select simpleDropDown = new Select(dropDown);
        simpleDropDown.selectByVisibleText("Option 1");

    }
    @Test
    public void  SelectDateOfBirth() {

        WebElement yearDropDown = driver.findElement(By.id("year"));
        //creat select class ob
        Select dropDownYear = new Select(yearDropDown);
        dropDownYear.selectByVisibleText("1990");

    }
    @Test
    public void selectMonthDropDown () {
        WebElement monthDropDown = driver.findElement(By.id("month"));
        //creat month select ob
        Select dropDownMonth = new Select(monthDropDown);
        dropDownMonth.selectByVisibleText("June");

    }
    @Test
    public void selectDayDropDown(){
        WebElement dayDropDown = driver.findElement(By.id("day"));
        Select daySelect = new Select(dayDropDown);
        daySelect.selectByVisibleText("5");

    }
    @AfterMethod
    public void tearDown(){
        System.out.println("Closing browser");
        driver.quit();
    }
}
