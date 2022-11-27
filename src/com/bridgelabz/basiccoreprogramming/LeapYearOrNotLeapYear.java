package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class LeapYearOrNotLeapYear {
    /**
    *This static Method is Created For Find year is Leap Year or not
    */
    static void checkLeapYear(){
        int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
     /**
    *Using if-else to known the given year is leap year or not
    */
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not A Leap Year");
    }
    /**
    *This Main Method is Created For call the static method checkLeapYear
    */

    public static void main(String[] args) {
        System.out.println("Enter Year For Checking Given Year is Leap Year Or NOT Leap Year");
        checkLeapYear();

    }
}
