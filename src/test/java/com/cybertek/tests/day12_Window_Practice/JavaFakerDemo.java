package com.cybertek.tests.day12_Window_Practice;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerDemo {
    @Test
    public void demo(){
        //Create Faker object
        Faker faker = new Faker();
        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);
        String city = faker.address().cityName();
        System.out.println("city = " + city);
        String chuckNorris = faker.chuckNorris().fact();
        System.out.println("chuckNorris = " + chuckNorris);
        String funnyName = faker.funnyName().toString();
        System.out.println("funnyName = " + funnyName);
    }
}
