package com.cybertek.WeeklyAssignments;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HoverTest extends TestBase {
    @Test
    public void hoverTest(){
        driver.get(ConfigurationReader.getProperty("hover.url"));
        //img1
        WebElement img1 = driver.findElement(By.xpath("(//img)[1]"));
        BrowserUtils.sleep(1);
        actions.moveToElement(img1).perform();
        assertTrue(img1.isDisplayed());
        //img2
        WebElement img2 = driver.findElement(By.xpath("(//img)[2]"));
        BrowserUtils.sleep(1);
        actions.moveToElement(img2).perform();
        assertTrue(img2.isDisplayed());
        //img3
        WebElement img3 = driver.findElement(By.xpath("(//img)[3]"));
        BrowserUtils.sleep(1);
        actions.moveToElement(img3).perform();
        assertTrue(img3.isDisplayed());
    }
    @Test
    public void contextClickTest(){
        driver.get(ConfigurationReader.getProperty("internet.hero.url"));

        WebElement context = driver.findElement(By.id("hot-spot"));
        actions.contextClick(context).perform();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    @Test
    public void dragDropTest(){
        driver.get(ConfigurationReader.getProperty("drag.drop.url"));

        WebElement smallCircle = driver.findElement(By.id("draggable"));
        WebElement bigCircle = driver.findElement(By.id("droptarget"));
        System.out.println("bigCircle.getText() = " + bigCircle.getText());
        BrowserUtils.sleep(4);
        actions.dragAndDrop(smallCircle,bigCircle).perform();
        assertTrue(smallCircle.isDisplayed());
        assertEquals(bigCircle.getText(),"You did great!","Try again!");

    }
}
