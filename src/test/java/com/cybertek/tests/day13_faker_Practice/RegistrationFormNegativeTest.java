package com.cybertek.tests.day13_faker_Practice;

import com.cybertek.utils.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class RegistrationFormNegativeTest extends RegistrationFormBase{
    @Test
    public void invalidFirstNameTest(){
        //do not enter any value in firstname and click sign up
        //first name is required " error msg should be displayed
        WebElement signUp = driver.findElement(By.id("wooden_spoon"));
        signUp.click();
        //wait for one second
        BrowserUtils.sleep(2);
        WebElement errorMsg = driver.findElement(By.id("wooden_spoon"));
        assertTrue(errorMsg.isDisplayed(),"Error message is not displayed");
        //type 1234 and verify "first name can only consist of alphabetical letters" is displayed;
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("12345");
        //firstName error msg
        WebElement noNumbersMsg = driver.findElement(By.xpath("//small[.='first name can only consist of alphabetical letters']"));
        assertTrue(noNumbersMsg.isDisplayed());
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("4564");
        //last name error msg
        WebElement lastNameErrorMsg = driver.findElement(By.xpath("//small[.='The last name can only consist of alphabetical letters and dash']"));
        System.out.println("lastNameErrorMsg.getText() = " + lastNameErrorMsg.getText());
        assertTrue(lastNameErrorMsg.isDisplayed());
        //userError Msg
        WebElement user = driver.findElement(By.name("username"));
        user.sendKeys("djo");
        WebElement userErrorMsg = driver.findElement(By.xpath("//small[.='The username must be more than 6 and less than 30 characters long']"));
        System.out.println("userErrorMsg.getText() = " + userErrorMsg.getText());
        assertTrue(userErrorMsg.isDisplayed());
        //EmailErrorMsg
        WebElement email = driver.findElement(By.name("email")); email.sendKeys("adhfka");
        WebElement ErrorMsg = driver.findElement(By.xpath("//small[.='Email format is not correct']"));
        System.out.println("ErrorMsg.getText() = " + ErrorMsg.getText());
        assertTrue(ErrorMsg.isDisplayed());
        //passErrorMsg
        WebElement pass = driver.findElement(By.name("password"));
        pass.sendKeys("kjkd");
        WebElement passErrorMsg = driver.findElement(By.xpath("//small[.='The password must have at least 8 characters']"));
        System.out.println("passErrorMsg.getText() = " + ErrorMsg.getText());
        assertTrue(ErrorMsg.isDisplayed());
        //PhoneErrorMsg
        WebElement phone = driver.findElement(By.name("phone"));phone.sendKeys("457484");
        WebElement phoneErrorMsg = driver.findElement(By.xpath("//small[.='Phone format is not correct']"));
        System.out.println("phoneErrorMsg.getText() = " + phoneErrorMsg.getText());
        assertTrue(passErrorMsg.isDisplayed());
        //DOBErrorMsg
        WebElement dob = driver.findElement(By.name("birthday"));dob.sendKeys("12346");
        WebElement dobErrorMsg = driver.findElement(By.xpath("//small[.='The date of birth is not valid']"));
        System.out.println("dobErrorMsg.getText() = " + dobErrorMsg.getText());
        assertTrue(dobErrorMsg.isDisplayed());


    }
}
