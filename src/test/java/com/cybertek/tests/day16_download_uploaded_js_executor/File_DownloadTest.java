package com.cybertek.tests.day16_download_uploaded_js_executor;

import com.cybertek.tests.TestBase;
import com.cybertek.utils.BrowserUtils;
import com.cybertek.utils.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class File_DownloadTest extends TestBase {
    @Test
    public void fileDownloadTest(){
        driver.get(ConfigurationReader.getProperty("download.url"));
        Assert.assertEquals(driver.getTitle(),"Practice");
        System.out.println(driver.getTitle());

        WebElement someFileTxt =driver.findElement(By.linkText("some-file.txt"));
        someFileTxt.click();
        BrowserUtils.sleep(2);
        //verify downloaded file
        String filePath = System.getProperty("user.home")+"/"+"Downloads"+"/"+"some-file.txt";
        System.out.println("FilePath = " + filePath);

        File file = new File(filePath);
        System.out.println("File exist = " + file.exists());
//        while (!file.exists()){
//            BrowserUtils.sleep(2);
//        }

        Assert.assertTrue(file.exists(), "File download failed");
        //delete after verification complete
       // file.delete();

    }

}
