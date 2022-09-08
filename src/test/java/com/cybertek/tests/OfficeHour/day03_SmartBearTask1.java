package com.cybertek.tests.OfficeHour;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class day03_SmartBearTask1 {
    @Test
    public void loginTest(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // open the page
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // page Title before login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        System.out.println(expectedTitle.equalsIgnoreCase(actualTitle));
        // username box info
        WebElement username = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        username.sendKeys("Tester");
        // password box
        WebElement password = driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        password.sendKeys("test"+ Keys.ENTER);

        // check the title after login

        String expectedTitleAfterLogin = "Web Orders";
        String actualTitleAfterLogin = driver.getTitle();
        System.out.println("expectedTitleAfterLogin = " + expectedTitleAfterLogin);
        System.out.println("actualTitleAfterLogin = " + actualTitleAfterLogin);
        System.out.println(expectedTitleAfterLogin.equalsIgnoreCase(actualTitleAfterLogin));

        driver.close();
    }

    @Test
    public void checkBoxTest() throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        // open the page
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        // username box info
        WebElement username = driver.findElement(By.cssSelector("#ctl00_MainContent_username"));
        username.sendKeys("Tester");
        // password box
        WebElement password = driver.findElement(By.cssSelector("#ctl00_MainContent_password"));
        password.sendKeys("test"+ Keys.ENTER);

        // click on Check All button
        WebElement checkAllButton = driver.findElement(By.id("ctl00_MainContent_btnCheckAll"));
        checkAllButton.click();

        // locating all the checkboxes
        List<WebElement> allCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        for (WebElement eachCheckBox : allCheckBoxes) {
            if (eachCheckBox.isSelected()==false){
                System.out.println("Not All selected");  // in TestNG we will learn assertions for these situations
                break;
            }
        }

        WebElement uncheckAllButton = driver.findElement(By.id("ctl00_MainContent_btnUncheckAll"));
        uncheckAllButton.click();

        allCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (WebElement eachCheckBox : allCheckBoxes) {
            if(eachCheckBox.isSelected()==true){
                System.out.println("Not All check boxes unselected");
                break;
            }
        }

        allCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println("Before I delete : " + allCheckBoxes.size());
        WebElement itemForDeleting = driver.findElement(By.xpath("//tr//td[.='Paul Brown']/../td[1]/input"));
        itemForDeleting.click();

        Thread.sleep(3000);


        WebElement deleteButton = driver.findElement(By.id("ctl00_MainContent_btnDelete"));
        deleteButton.click();

        allCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

        System.out.println("After I delete : "+ allCheckBoxes.size());







        driver.close();
    }
}
