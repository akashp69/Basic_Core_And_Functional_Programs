package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class CheckNumberEvenOrOdd {
    static void checkEvenOrOdd (){
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if(number%2==0)
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");


    }
    public static void main(String[] args) {
        System.out.println("Enter a Number For Checking Number is Even Or Odd");
        checkEvenOrOdd();

    }
}
