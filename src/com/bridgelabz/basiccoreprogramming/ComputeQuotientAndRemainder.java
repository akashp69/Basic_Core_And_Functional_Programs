package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {
     /**
    *This  Method is Created For Find The Value of quotient and remainder
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /**
    *Enter the Values of Dividend and Divisors For getting the values of  quotient and remainder
    */
        int dividend;
        int divisor;
        int quotient;
        int remainder;
        System.out.println("Enter the dividend");
        dividend = scanner.nextInt();
        System.out.println("Enter the divisor");
        divisor = scanner.nextInt();
        quotient = dividend / divisor;
        remainder = dividend % divisor;
    /**
    *Print the values of quotient and remainder
    */
        System.out.println("quotient = "+quotient + ";" + "remainder = "+remainder);
    }
}
