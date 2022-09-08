package com.cybertek.WeeklyAssignments;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class World_Population {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        String url = ("https://www.worldometers.info/world-population");
        driver.manage().window().maximize();

        driver.get(url);

        Thread.sleep(4000);
        //<div class = 'maincounter-number'>
        WebElement worldPopulation = driver.findElement(By.xpath("//div[@class='maincounter-number']"));
        System.out.println(worldPopulation.getText()); // print the text

        for(int i = 1; i <= 10; i++){

            Thread.sleep(1000);
            System.out.println(i + " " + worldPopulation.getText());

        }

        driver.quit();


    }
}
