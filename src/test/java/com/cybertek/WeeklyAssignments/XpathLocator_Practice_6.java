package com.cybertek.WeeklyAssignments;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathLocator_Practice_6 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        String url = "http://practice.cybertekschool.com/multiple_buttons";

        driver.get(url);

        //<button class="btn btn-primary" onclick="button1()">Button 1</button>
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();

        //<p id="result" style="color:green">Clicked on button one!</p>
        WebElement resultMsg = driver.findElement(By.xpath("//p[@id='result']"));

        System.out.println(resultMsg.getText());

        Thread.sleep(1000);
        //Locate button2 using xpath and check if its currently displayed, then click on it

        //<button class="btn btn-primary" onclick="button2()" name="button2">Button 2</button>
        //first way to find WebElement button2 = driver.findElement(By.xpath("//button[2]"));
        //second way to find WebElement button2 = driver.findElement(By.xpath("//button[.=text()='Button 2']"));
        WebElement button2 = driver.findElement(By.xpath("//button[text()='Button 2']"));

        if(button2.isDisplayed()){
            System.out.println("Pass : Button2 is displayed");
            button2.click();
        }else {
            System.out.println("Fail : Button is not displayed");
        }
        System.out.println(resultMsg.getText());

        //Button 3 <button class="btn btn-primary" onclick="button3()" id="button_three">Button 3</button>
        WebElement button3 = driver.findElement(By.xpath("//button[text()='Button 3']"));
        String result = "";
        if(button3.isDisplayed()){
            result = "Pass: Button 3 displayed ";
            button3.click();

        }else {
            result ="Fail: Button 3 not displayed";
        }
        Thread.sleep(2000);
        System.out.println(result);

        //<p id="result" style="color:green">Clicked on button one!</p>
        String resutl = driver.findElement(By.id("result")).getText();

        System.out.println("Result " + resutl);


        driver.quit();

    }
}
