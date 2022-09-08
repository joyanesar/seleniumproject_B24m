package com.cybertek.tests.Task2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5_Php_Travels_Registration_Test {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager .chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://www.phptravels.net";
        driver.get(url);
        driver.manage().window().maximize();

        //searched by full xpath
        WebElement searchSignup = driver.findElement(By.xpath("//a[@href='https://www.phptravels.net/signup']"));
        searchSignup.click();
        //Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.name("first_name"));
        firstName.sendKeys("Nahal");
        //Thread.sleep(1000);
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("happy");
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("88151515");
        Thread.sleep(1000);
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("peberam614@datakop.com");
        Thread.sleep(1000);
        WebElement passSetup = driver.findElement(By.name("password"));
        passSetup.sendKeys("password");
        Thread.sleep(1000);

        //Account Type selection
        WebElement AccountType = driver.findElement(By.xpath("//*[@id=\"select2-account_type-container\"]"));
        AccountType.click();
        Thread.sleep(1000);

        //sign up
        WebElement signUp = driver.findElement(By.className("ladda-label"));
        signUp.click();
        Thread.sleep(2000);

        //login
        WebElement logIn = driver.findElement(By.xpath("//span[@class='ladda-label']"));
        logIn.click();

        //verify title
        String expTitle = "Login - PHPTRAVELS";
        String actTitle = driver.getTitle();

        if(actTitle.equals(expTitle)){
            System.out.println("Pass : Title verification");
        }else {
            System.out.println("Fail : Title Verification");
        }

        System.out.println(driver.getTitle());

        //email
        signUp = driver.findElement(By.name("email"));
        signUp.sendKeys("peberam614@datakop.com");

        //password
        passSetup = driver.findElement(By.name("password"));
        passSetup.sendKeys("password");

        //log in
        logIn = driver.findElement(By.className("ladda-label"));
        logIn.click();


        WebElement msg = driver.findElement(By.xpath("//h2[@class='sec__title font-size-30 text-white']"));
        System.out.println("Welcome back msg : " + msg.getText());
        Thread.sleep(2000);

//        WebElement logOut = driver.findElement(By.xpath("//a[@href='la la-power-off mr-2 text-color-6']"));
//        logOut.click();

        driver.quit();



    }
}
