package com.cybertek.pages;

import com.cybertek.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearDashBoardPage {
    //constructor
    public SmartBearDashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(name = "ctl00$MainContent$username")
    public WebElement name;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement id;

    public void getLink(String link){
        Driver.getDriver().findElement(By.partialLinkText(link)).click();
    }
    public void getClick(String check){
        Driver.getDriver().findElement(By.name(check)).click();
    }
    /*
    Login: credentials(Tester and test)
Navigate to Orders link, then navigate back to AllOrders link
click on one checkBox for "Charles Dodgeson"
then click deleteButton
then logout from the page
     */

}
