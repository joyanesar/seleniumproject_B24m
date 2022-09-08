package com.cybertek.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.*;
public class EdmundsCarDetailsPage extends BasePage{



    @FindBy(xpath = "//span[@class='d-inline-block']")
    public WebElement msrpRange;

    public String getMsrpRange(){
        return msrpRange.getText();
    }
    @Override
    public void isCurrentPage() {
       assertEquals(driver.getTitle(),"2022 Audi Q5 Prices, Reviews, and Pictures | Edmunds");





    }
}
