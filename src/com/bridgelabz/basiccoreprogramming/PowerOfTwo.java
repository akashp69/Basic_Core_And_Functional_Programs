package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE POWER OF 2 PROGRAM");
        Scanner scanner = new Scanner(System.in);
        int number;
        int integer=1;
        int power = 1;
        System.out.println("Enter the power until which you want to calculate");
        number = scanner.nextInt();
        while(integer<=number) {
            power=power * 2;
            System.out.println("values of powers = "+power);
            integer++;
        }
    }
}
