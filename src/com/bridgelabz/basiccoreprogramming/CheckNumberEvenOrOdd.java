package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class CheckNumberEvenOrOdd {
     /**
    *This Static Method is Created For checking alphabets vowel or not
    */
    static void checkEvenOrOdd (){
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
    /**
    *Using if-else for check number is odd Or Even
    */
        if(number%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");

  
    }
     /**
    *This Main Method is Created For Calling Static Method checkEvenOrOdd
    */
    public static void main(String[] args) {
        System.out.println("Enter a Number For Checking Number is Even Or Odd");
        checkEvenOrOdd();

    }
}
