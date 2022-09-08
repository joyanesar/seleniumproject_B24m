package com.cybertek.tests.Task4_faker;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DragAndDrop extends TestBase {

    @Test
    public void dragAndDrop() {
        driver.get(ConfigurationReader.getProperty("dragadndrop.url"));

        WebElement fivK = driver.findElement(By.linkText("5000"));
        WebElement amt = driver.findElement(By.id("amt7"));
        actions.dragAndDrop(fivK, amt).perform();

        WebElement sales = driver.findElement(By.linkText("SALES"));
        WebElement account = driver.findElement(By.id("loan"));
        actions.dragAndDrop(sales, account).perform();

        BrowserUtils.sleep(2);

        WebElement bank = driver.findElement(By.linkText("BANK"));
        WebElement account1 = driver.findElement(By.id("bank"));
        actions.dragAndDrop(bank, account1).perform();

        WebElement fik1 = driver.findElement(By.linkText("5000"));
        WebElement amount = driver.findElement(By.id("amt8"));
        actions.dragAndDrop(fik1, amount).perform();

    }

    @Test
    public void carguruslPriceSilderTest() {
        driver.get(ConfigurationReader.getProperty("cargurus.url") + "/Cars/inventorylisting/viewDetailsFilterViewInventoryListing.action?sourceContext=carGurusHomePageModel&entitySelectingHelper.selectedEntity=&zip=12209");

        WebElement roleSlider = driver.findElement(By.xpath("//button[@aria-valuemax='350000'][1]"));
//        actions.dragAndDropBy(roleSlider,150,0).perform();
//        actions.dragAndDropBy(roleSlider,-150,0).perform();

        for (int i = 0; i <= 15; i++) {
            actions.clickAndHold(roleSlider).sendKeys(Keys.ARROW_RIGHT, Keys.ARROW_RIGHT, Keys.ARROW_RIGHT).perform();
        }
        for (int i = 0; i < 10; i++) {

            actions.clickAndHold(roleSlider).sendKeys(Keys.ARROW_LEFT, Keys.ARROW_LEFT).perform();
        }

    }

}
