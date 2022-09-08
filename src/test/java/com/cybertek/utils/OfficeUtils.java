package com.cybertek.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OfficeUtils {
    static Alert alert;

    public static WebElement getLink(String str) {
        return Driver.getDriver().findElement(By.partialLinkText(str));
    }

    //addProduct(String category, String productName),return value which is product price,
    public static int addProduct(String category, String product) {

        getLink(category).click();
        getLink(product).click();
        //getting the product price;
        WebElement priceContainer = Driver.getDriver().findElement(By.xpath("//h3"));
        int productsPrice = Integer.parseInt(priceContainer.getText().substring(1, 4));

        //click on add to cart
        getLink("Add to cart");
        BrowserUtils.sleep(2);
        alert = Driver.getDriver().switchTo().alert(); //initialize the object
        alert.accept();
        getLink("Home").click();
        return productsPrice;

    }

 public static int removeProduct(String product) {
        int productPrice = 0;
       //remove the product and return its price as well
     //Delete btn way on// //tbody//tr/td[contains(text),'sony vaio i7')]/..//td[.='Delete']/a
     //Delet btn way two////tbody//tr/td[contains(text),'sony vaio i7')/following-sibling::*/a
     //priceText element://tbody//tr/td[contains(text),'sony vaio i7')/following-sibling::*/a

     WebElement deleteBtn = Driver.getDriver().findElement(By.xpath("//tbody//tr/td[contains(text(),'" + product+"')]/following-sibling::*/a"));
     WebElement priceTextElement = Driver.getDriver().findElement(By.xpath("//tbody//tr/td[contains(text(),'"+ product+"')]/following-sibling::*"));

     productPrice = Integer.parseInt(priceTextElement.getText());
     deleteBtn.click();
     BrowserUtils.sleep(3);

     return productPrice;
    }
}
