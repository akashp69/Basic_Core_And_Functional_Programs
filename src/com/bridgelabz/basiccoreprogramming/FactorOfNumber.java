package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        System.out.println("Prime factors for the given numbers:");

        for (int integer = 2; integer <= number; integer++) {

            while (number % integer == 0) {
                number = number / integer;

                System.out.println(integer);
            }
        }
    }}
