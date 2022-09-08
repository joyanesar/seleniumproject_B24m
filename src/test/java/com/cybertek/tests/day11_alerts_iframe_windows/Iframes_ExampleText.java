package com.cybertek.tests.day11_alerts_iframe_windows;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Iframes_ExampleText {
    String url = "http://practice.cybertekschool.com/iframe";
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void iframeTest(){
        // switch to the frame by id "mce_0_ifr"
        driver.switchTo().frame("mce_0_ifr");
        // now we are focused on the frame
        WebElement commentField = driver.findElement(By.id("tinymce"));
        System.out.println("Comment text = " + commentField.getText());
        commentField.clear();
        commentField.sendKeys("Hello Hello");
        // go out from iframe back to main content
        driver.switchTo().defaultContent();

    }
    @Test
    public void multipleFrameTest(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
        //find count of frame on this page
        List<WebElement> frames = driver.findElements(By.tagName("frame"));
        System.out.println("count of frames : " + frames.size());

        //switch to button frame by name
        driver.switchTo().frame("frame-bottom");
        WebElement bodyElement = driver.findElement(By.tagName("body"));
        System.out.println("Text of bottom frame = " + bodyElement.getText());
        assertEquals(bodyElement.getText(),"BOTTOM");
        //go out from bottom frame to main level
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        //Switch to first frame(index 0)
        driver.switchTo().frame(0).switchTo().frame(1);
        bodyElement = driver.findElement(By.tagName("body"));
        System.out.println("Frame o body element text = " + bodyElement.getText());
        //go back parent frame then back to default content
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        //Third way to approach
        driver.switchTo().frame(0).switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_right']")));
        bodyElement= driver.findElement(By.tagName("body"));
        System.out.println("Frame right body element text  = " + bodyElement.getText());

        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0).switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_left']")));
        bodyElement = driver.findElement(By.tagName("body"));
        System.out.println("Frame left body element text = " + bodyElement.getText());


    }
}












