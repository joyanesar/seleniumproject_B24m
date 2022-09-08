package com.cybertek.WeeklyAssignments;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleMap_XpathTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = "https:maps.google.com";
        driver.get(url);
        driver.manage().window().maximize();


        WebElement addressSearchField = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[1]/div[1]/div[2]/form/div/div[3]/div/input[1]"));
        addressSearchField.sendKeys("Dallas Airport" + Keys.ENTER);

       // driver.close();
        //Click on direction
        Thread.sleep(2000);

        WebElement direction = driver.findElement(By.xpath("/html/body/div[3]/div[9]/div[3]/div[1]/div[1]/div[1]/div[2]/form/div/div[3]/div/input[1]"));
        addressSearchField.sendKeys("albany , ny " + Keys.ENTER);

        direction.click();

        Thread.sleep(1000);
        WebElement startingAddressField = driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']"));
        startingAddressField.sendKeys("albany , NY" + Keys.ENTER);

        driver.quit();





    }


}
