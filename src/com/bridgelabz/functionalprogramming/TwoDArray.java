package com.bridgelabz.functionalprogramming;

import java.util.Scanner;

public class TwoDArray {
    /**
    *This  Method is Created For Print the 2D Array
    */
    public static void main(String[] args) {
        

        int row, col, i, j;
        int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);

    /**
    *Enter Rows And columns 
    */
        System.out.print("Enter row for the array (max 3) : ");
        row = scanner.nextInt();
        System.out.print("Enter column for the array (max 3) : ");
        col = scanner.nextInt();

    /**
    *Enter Elements of array for rows And colums
    */
        System.out.println("Enter " + (row * col) + " Array Elements : ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

    /**
    *Using For Loop For Print The 2D Array
    */
        System.out.print("The Array is :");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println("");
        }
    }
}
