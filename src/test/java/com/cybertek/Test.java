package com.cybertek;

import com.cybertek.utils.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

    public static void main(String[] args) {

        String currentMonth = "Feb";
        String currentYear  = "2023";

        if(currentMonth.equals("April")&& currentYear.equals("2023")){
            System.out.println("This is current month");
        }else if(!currentMonth.equals("April") && currentYear.equals("2019")){
            System.out.println("click farwerd");

        }else {
            System.out.println("Backfarward");
        }


    }

}
