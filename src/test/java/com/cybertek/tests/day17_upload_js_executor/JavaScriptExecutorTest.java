package com.cybertek.tests.day17_upload_js_executor;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaScriptExecutorTest extends TestBase {
    @Test
    public void alertExampleTest(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('hello hello!')");
        BrowserUtils.sleep(2);

        Alert alert = driver.switchTo().alert();
        System.out.println("alert .getText() = " + alert .getText());
        alert.accept();
    }
    @Test
    public void scrollTest(){
        driver.get(ConfigurationReader.getProperty("scroll.url"));
        BrowserUtils.sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1200)");
        // adding negative - it will scrollUp

        for(int i =0; i < 10; i++){
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,1000)");
        }

    }
    @Test
    public void scrollElementVisible(){
        driver.get(ConfigurationReader.getProperty("tesla.url"));

        WebElement modelYLabel = driver.findElement(By.xpath("//h1[.='Model Y'][1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)" , modelYLabel);
        BrowserUtils.sleep(2);

        WebElement shopNow = driver.findElement(By.xpath("//a[@title='Shop Now']"));
        js.executeScript("arguments[0].scrollIntoView(true)" , shopNow);
    }
    @Test
    public void loginFacebook(){
        driver.get(ConfigurationReader.getProperty("facebook.url"));

        WebElement user = driver.findElement(By.name("email"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='hello@gmail.com'", user);

        WebElement pass = driver.findElement(By.name("pass"));
        js.executeScript("arguments[0].value='password'", pass);

        WebElement login = driver.findElement(By.name("login"));
        js.executeScript("arguments[0].value='login'", login);

        Assert.assertEquals(driver.getTitle(),"Facebook - Log In or Sign Up");

    }

}
