package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class HarmonicNumber {
    /**
    *This  Method is Created For Find The  Harmonic Number
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        double result=0.0;
        System.out.println("Enter the Nth Harmonic Number");
        number = scanner.nextInt();
    /**
    *used While Loop For getting Harmonic Number
    */
        while (number>0) {
            result =result+ (double)1/number;
            number--;
        }
        System.out.println("Nth harmonic output is= "+result);
    }
}
