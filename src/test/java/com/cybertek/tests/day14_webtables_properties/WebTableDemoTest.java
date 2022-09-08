package com.cybertek.tests.day14_webtables_properties;

import com.cybertek.utils.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.*;
public class WebTableDemoTest {

    WebDriver driver;
    String url = "http://practice.cybertekschool.com/tables";

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(url);
    }
    @Test
    public void readFromTableTest(){
        //print table data as single String not so common , bus useful sometimes
        WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println("table1.getText() = " + table1.getText());
        //verify any information or emails
        assertTrue(table1.getText().contains("jsmith@gmail.com"));
        System.out.println(table1.getText());
        
        //print all colum names single line
        WebElement allColNames = driver.findElement(By.xpath("//table[@id='table1']/thead/tr"));
        System.out.println("allColNames.getText() = " + allColNames.getText());
        //print each colum names in separate lines using a loop and findElements
        List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        System.out.println("count size is = " + list.size());
        
        for(WebElement each : list){
            System.out.println("Each colum contains  = " + each.getText());
        }
        //print first col + first cell data
        String xpath = "//table[@id='table1']/tbody//tr[1]/td[1]";
        WebElement firstCell = driver.findElement(By.xpath(xpath));
        System.out.println("firstCell.getText() = " + firstCell.getText());
        
        //print second col + last cell data
        String xpath1 = "//table[@id='table1']/tbody//tr[1]/td[2]";
        WebElement lastNames = driver.findElement(By.xpath(xpath1));
        System.out.println("lastNames.getText() = " + lastNames.getText());
        System.out.println("col 1 , row 4 " + getCellData(1,4));
        System.out.println("col 3  , row 3 "  + getCellData(3,3));
        System.out.println("col 1  row 1 " + getCellData(1,1));
        driver.quit();
    }
    @Test
    public void getAllColumnData(){
        //print all names
        List<WebElement> list = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[2]"));
        for(WebElement name: list){
            System.out.println("Each names = " + name.getText());
        }
        //for(int i =0; i <names.size; i++){
        //System.out.println(i +1 "-" + names.get(i).getText()+ ""+ email.get(i).getText());
        //print all emails
        List<WebElement> emails = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td[3]"));
        for(WebElement email : emails){
            System.out.println("Each Email = " + email.getText());
        }

    }

    @Test
    public void printAllTableDataTest() {
        //get rows count and assign to rowsCount variable and print it
        int rowsCount = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
        System.out.println("rowsCount = " + rowsCount);

        for (int r = 1; r <= rowsCount; r++) {
            for(int c = 1; c <= 6; c++) {
//                String value = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+r+"]/td["+c+"]")).getText();
                String value = getCellData(r , c);
                System.out.println("value = " + value);
            }
        }
        /**
         table data => 2 d array => String[][] data
         table data => list of maps => List<Map<String, String> data
         table data => list of customer objects
         */
        //table[@id='table1']//td[.='John']/preceding-sibling::td , how to find next to each data info
    }
    @Test
    public void readNextCell(){
        WebElement johnEmail = driver.findElement(By.xpath("//table[@id='table1']//td[.='John']/following-sibling::td[1]"));
        System.out.println("johnEmail.getText() = " + johnEmail.getText());
        
        WebElement johnLastName = driver.findElement(By.xpath("//table[@id='table1']//td[.='John']/preceding-sibling::td[1]"));
        System.out.println("John last name " + johnLastName.getText());
    }
    public String getCellData(int row, int col){
        String xpath = "//table[@id='table1']/tbody//tr["+row+"]/td["+col+"]";
        return driver.findElement(By.xpath(xpath)).getText();

    }

}











