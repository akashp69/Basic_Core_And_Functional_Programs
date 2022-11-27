package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class CheckAlphabetsVowelsOrConsonant {
    /**
    *This Static Method is Created For checking alphabets vowel or not
    */
    static void checkAlphabet(){
        char alphabet;
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
    /**
    *Using if-else for comparing given alphabets is vowel or not
    */
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u')
            System.out.println("Vowel");
        else
            System.out.println("NOT Vowel");
    }
     /**
    *This  Method is Created For call the static method checkAlphabet
    */
    public static void main(String[] args) {

        System.out.println("Check Letter is Vowel Or NOT Enter Any Alphabet");
        checkAlphabet();
    }
}
