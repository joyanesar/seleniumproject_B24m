package com.cybertek.tests.day15_properties_driverUtil_testbase;
import com.cybertek.utils.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import static org.testng.Assert.*;
public class PropertiesFileTest {
    @Test
    public void readValuesFromPropertiesFile() throws Exception {
        //Properties Class
        Properties prop = new Properties();
        //open file using FileInputStream  (I O ) INPUT/ OUTPUT
        FileInputStream fis = new FileInputStream("configuration.properties"); // fis -> file stream object
        //load file content into properties
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("webtableUrl"));
        System.out.println(prop.getProperty("env"));  // env  -> environment
    }
    @Test
    public void configurationReaderUnitTest(){
        System.out.println(ConfigurationReader.getProperty("browser"));
        String url = ConfigurationReader.getProperty("webtableUrl");
        System.out.println("url = " + url);

        Assert.assertEquals(ConfigurationReader.getProperty("browser"),"chrome");
        Assert.assertEquals(ConfigurationReader.getProperty("env"),"qa");

        Assert.assertEquals(ConfigurationReader.getProperty("hello"),null);

    }
}
