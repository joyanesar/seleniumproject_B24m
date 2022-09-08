package com.cybertek.tests.day15_properties_driverUtil_testbase;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TechlisticWebtaleTest extends TestBase {
    /** go to url "https://www.techlistic.com/p/demo-selenium-practice.html'
     * Assert current url contoins "techlistic"
     * print all Building names
     *
     */
    @Test
    public void tallBuildingsTableTest(){
        driver.get(ConfigurationReader.getProperty("techlistic.url"));  // reading Url from configuration prop
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getCurrentUrl().contains("techlistic"));

        //Assignment 1: Verify that there are only 4 structure values present.

        WebElement burjKhlalif = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
        System.out.println("Biggest building is = " + burjKhlalif.getText());



        List<WebElement> allBuildings = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/th"));
        for (WebElement eachBuilding : allBuildings){
            System.out.println("Building name is = " + eachBuilding .getText());


            System.out.println(eachBuilding.getSize());
        }
        //Read the value of Total
        WebElement totalColumn = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tfoot/tr/th"));
        System.out.println(totalColumn.getText());


       }

   }
