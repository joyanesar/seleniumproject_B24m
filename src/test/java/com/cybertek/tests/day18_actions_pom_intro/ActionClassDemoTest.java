package com.cybertek.tests.day18_actions_pom_intro;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ActionClassDemoTest extends TestBase {

    @Test
    public void hoverElementTest() {
        // Actions actions = new Actions(driver);
        driver.get(ConfigurationReader.getProperty("hover.url"));

        WebElement img1 = driver.findElement(By.xpath("(//img)[1]"));
        //hover over img1
        actions.moveToElement(img1).perform();


        WebElement img2 = driver.findElement(By.xpath("(//img)[2]"));
        actions.moveToElement(img2).perform();

        WebElement img3 = driver.findElement(By.xpath("(//img)[3]"));
        actions.moveToElement(img3).perform();

        actions.moveToElement(img1).perform();
    }
    @Test
    public void loopActions(){
        // repeat with loops
        driver.get(ConfigurationReader.getProperty("hover.url"));
       // List<WebElement> hoverImgs = driver.findElements(By.xpath("//img"));
        List<WebElement> imgs = driver.findElements(By.tagName("img"));

        for(WebElement each: imgs){
            BrowserUtils.sleep(2);
            actions.moveToElement(each).perform();

        }



    }
    @Test
    public void googleActionsTest(){

        driver.get(ConfigurationReader.getProperty("google.url"));

        WebElement search = driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']"));

        WebElement feelingLucky = driver.findElement(By.id("gbqfbb"));
        //actions need it


        for(int i =0; i <= 5; i++){
            actions.moveToElement(search).perform();
            BrowserUtils.sleep(1);
            actions.moveToElement(feelingLucky).perform();
            BrowserUtils.sleep(1);
        }

    }

}









