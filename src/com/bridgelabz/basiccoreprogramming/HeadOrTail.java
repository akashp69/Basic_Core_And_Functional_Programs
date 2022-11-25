
package com.bridgelabz.basiccoreprogramming;

import java.util.Scanner;

public class HeadOrTail {
    static void checkHeadAndTail(){
        int coin;
        Scanner sc = new Scanner(System.in);
        coin = sc.nextInt();
        if ((coin>=0)&&(coin<=1))
            System.out.println("Head");
        else
            System.out.println("Tail");

    }

    public static void main(String[] args) {
        System.out.println("Check Head Or Tail");
        checkHeadAndTail();
    }
}