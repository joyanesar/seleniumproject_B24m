package com.cybertek.tests.day07_findElements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorAddTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String calUrl = "https://www.calculator.net";
        driver.get(calUrl);
        int num1 = 5 ,   num2 = 3  ,   expectedResult = 8;
        WebElement numOne = driver.findElement(By.cssSelector("span[onclick='r(5)']"));
        WebElement plus = driver.findElement(By.xpath("//span[.='+']")); // using xpath
        WebElement numTwo = driver.findElement(By.cssSelector("span[onclick='r(3)']"));
        WebElement equal = driver.findElement(By.xpath("//span[text()='=']")); // 2nd option span[.='=']

        WebElement multiElement = driver.findElement(By.xpath("//span[text()='x']"));
        numOne.click();
        Thread.sleep(2000);
        plus.click();
        numTwo.click();
        Thread.sleep(1000);
        equal.click();
        Thread.sleep(1000);
        WebElement result = driver.findElement(By.cssSelector("div[id='sciOutPut']")); //#sciOutPut syntx of scc
        System.out.println(num1 + " + " + num2 + " = " + result.getText());
        String resultValue = result.getText();
        //get rid of right/left spaces
        resultValue = resultValue.trim();
        //convert to from String to in
        int actualResult = Integer.parseInt(resultValue);

        if(actualResult == expectedResult){
            System.out.println("Pass calculation");
        }else {
            System.out.println("Fail calculation");
        }


        driver.quit();



    }
}
