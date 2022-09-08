package com.cybertek.tests.day07_findElements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorAddTestV2 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        String calUrl = "https://www.calculator.net";
        driver.get(calUrl);
        int num1 = 7 ,   num2 = 4 ;
        int expectedResult =  num1 + num2;
        System.out.println("//span[.='" + num1 +"']"); //span[.='7']
        WebElement num1Elem = driver.findElement(By.xpath("//span[.='" + num1 + "']")); //xpath shorCut
        WebElement num2Elem = driver.findElement(By.xpath("//span[.='" + num2 + "']")); //xpath shortCut
        System.out.println("//span[.='" + num2 + "']");
        WebElement plus = driver.findElement(By.xpath("//span[.='+']"));
        WebElement equal= driver.findElement(By.xpath("//span[.='=']"));

        num1Elem.click();
        plus.click();
        num2Elem.click();
        equal.click();
        WebElement result = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        System.out.println("Result of " + num1 + " + " + num2 + " = " +  (result.getText()));

        //Css shortCut /int num1 =2, int num = 2 second version of finding elements
//        WebElement numOne = driver.findElement(By.cssSelector("span[onclick='r(" + num1 + ")']"));
//        WebElement numTwo = driver.findElement(By.cssSelector("span[onclick='r(" + num2 + ")']"));
//        numOne.click();
//        plus.click();
//        numTwo.click();
//        equal.click();
//        WebElement additionResult = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
//        System.out.println("AdditionResult  " + (additionResult.getText()));

            //from child to parent

            //from parent to child
            //


        driver.quit();
    }
}
