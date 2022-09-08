package com.cybertek.tests.day07_findElements;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.*;

import java.util.List;

public class Add_Remove_Elements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = "http://practice.cybertekschool.com/add_remove_elements/";
        driver.manage().window().maximize();
        driver.get(url);
        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        for (int i = 0; i < 50 ; i++) {
            addElement.click();
        }
        Thread.sleep(3000);
        //verify 50 delete buttons ar on the page
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//button[.='Delet']"));
        System.out.println("Count of delete buttons " + deleteButtons.size());

        if(deleteButtons.size() == 50){
            System.out.println("Pass 50 button added succefully");
        }else {
            System.out.println("Fail 50 button");
        }

        Thread.sleep(3000);
        //click all delete buttons to remove them
//        for (WebElement deleteButton : deleteButtons) {
//            deleteButton.click();
//        }
        Thread.sleep(3000);
        deleteButtons.forEach(deleteBtn -> deleteBtn.click());

        // run findElement for delete buttons again see if it is 0
        deleteButtons = driver.findElements(By.xpath("//button[.='Delet']"));
        if(deleteButtons.isEmpty()){
            System.out.println("Pass :50 buttons are deleted ");
        }else {
            System.out.println("Fail");
        }


        driver.quit();






    }
}
