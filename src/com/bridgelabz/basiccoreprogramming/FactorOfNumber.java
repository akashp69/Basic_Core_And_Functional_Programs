package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class FactorOfNumber {
     /**
    *This  Method is Created For Find The  Factors of Numbers
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    /**
    *Enter a number for getting th factors of that number 
    */
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("Prime factors for the given numbers:");
    /**
    *Used For loop for get factors 
    */

        for (int integer = 2; integer <= number; integer++) {

            while (number % integer == 0) {
                number = number / integer;

                System.out.println(integer);
            }
        }
    }}
