package com.cybertek.tests.day19_page_object_model;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
public class DragAndDropTest extends TestBase {
    @Test
    public void guru99DragAndDropTest() {
        driver.get(ConfigurationReader.getProperty("dragadndrop.url"));
        WebElement bank = driver.findElement(By.linkText("BANK"));
        actions.doubleClick().perform();
        BrowserUtils.sleep(1);
        WebElement amt = driver.findElement(By.id("bank"));
        actions.dragAndDrop(bank,amt).perform();

        WebElement fiveK = driver.findElement(By.linkText("5000"));
        WebElement bankAmount = driver.findElement(By.id("amt7"));
        actions.dragAndDrop(fiveK,bankAmount).perform();

       // actions.dragAndDropBy(fiveK,768,352).perform();
    }
    @Test
    public void cargurusPriceSliderTest() {
        driver.get(ConfigurationReader.getProperty("cargurus.url")+"/Cars/inventorylisting/viewDetailsFilterViewInventoryListing.action?sourceContext=carGurusHomePageModel&entitySelectingHelper.selectedEntity=d177&zip=22102");
        WebElement priceSlider = driver.findElement(By.xpath("//button[@aria-valuemin='3000'][1]"));
//        for(int i = 0; i <= 10; i++){
//            actions.clickAndHold(priceSlider).sendKeys(Keys.ARROW_RIGHT).release().perform();
//        }//        actions.clickAndHold(priceSlider).sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT).perform()
        actions.dragAndDropBy(priceSlider, 200,0).perform();  // moves to the right end
        actions.dragAndDropBy(priceSlider,-200,0).perform();  // moves to the left

    }
}
;