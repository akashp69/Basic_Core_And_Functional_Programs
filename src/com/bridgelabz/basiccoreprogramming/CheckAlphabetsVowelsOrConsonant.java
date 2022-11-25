package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class CheckAlphabetsVowelsOrConsonant {
    static void checkAlphabet(){
        char alphabet;
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("NOT Vowel");
    }
    public static void main(String[] args) {

        System.out.println("Check Letter is Vowel Or NOT Enter Any Alphabet");
        checkAlphabet();
    }
}
