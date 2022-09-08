package com.cybertek.tests.day10_dropdown_alert_iframes_windows;

public class test {
    public static void main(String[] args) {

        String msg = "I love Java";
        String mg = "java";

        String[] arr = msg.split(" ");
        String rvs = "";

        for(int i = arr.length-1; i>=0; i--){

            rvs +=arr[i] + " ";
        }
        String rv = "";
        for(int i = mg.length()-1; i >=0; i--){

            rv+=mg.charAt(i) + "";
        }

        System.out.println(rvs);
        System.out.println(rv);

    }
}
