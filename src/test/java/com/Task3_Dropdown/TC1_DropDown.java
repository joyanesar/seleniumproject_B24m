package com.Task3_Dropdown;

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

public class TC1_DropDown {
    /*
    TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State”
     */
    String url = "http://practice.cybertekschool.com/dropdown";
    WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);

    }
    @Test
    public void verifyTitle(){
        System.out.println("verify title page " + driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Practice");
    }
    @Test
    public void simpleDropDown(){
        WebElement dropdown = driver.findElement(By.id("dropdown"));
        Select drop = new Select(dropdown);
        drop.selectByValue("1");

        Select verifyStateSelection = new Select(driver.findElement(By.id("state")));
        verifyStateSelection.selectByVisibleText("Select a State");
        Assert.assertEquals(verifyStateSelection.getFirstSelectedOption().getText(),"Select a State");

    }
    @Test
    public void selectingState(){
        Select states = new Select(driver.findElement(By.id("state")));
        states.selectByValue("IL");
        states.selectByValue("VA");
        states.selectByValue("CA");
        states.selectByVisibleText("Select a State");
        WebElement lastSelected = driver.findElement(By.xpath("//option[.='California']"));
        Assert.assertEquals(lastSelected.getText(),"California");
        Assert.assertEquals(states.getFirstSelectedOption().getText(),"Select a State");


    }
    @Test
    public void selectingDate(){
        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("1992");
        Select selectMonth = new  Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("11");
        Select daySelect = new Select(driver.findElement(By.id("day")));
        daySelect.selectByVisibleText("1");

    }
    @Test
    public void selectMultipleDropDown(){
        Select programingLanguages = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        programingLanguages.selectByValue("java");
        programingLanguages.selectByValue("js");
        programingLanguages.selectByValue("c#");
        programingLanguages.selectByValue("python");
        programingLanguages.selectByValue("ruby");
        programingLanguages.selectByValue("c");
//        System.out.println(programingLanguages.getAllSelectedOptions());
//        programingLanguages.deselectAll();

    }
    @Test
    public void nonSelectDropdown(){
        WebElement dropdown = driver.findElement(By.xpath("//a[@class='btn btn-secondary dropdown-toggle']"));
        dropdown.click();
        WebElement clickOnFacebook = driver.findElement(By.cssSelector("a[class='Facebook']"));
        clickOnFacebook.click();

        Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");


    }
    @AfterClass
    public void tearDown(){
        //driver.quit();
    }

}
