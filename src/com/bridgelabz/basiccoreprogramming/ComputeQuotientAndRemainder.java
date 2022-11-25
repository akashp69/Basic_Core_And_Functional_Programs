package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("quotient = "+quotient + ";" + "remainder = "+remainder);
    }
}