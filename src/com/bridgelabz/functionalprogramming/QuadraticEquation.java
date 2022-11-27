package com.bridgelabz.functionalprogramming;

import java.util.*;


public class QuadraticEquation {
    /**
     * This Method is Created for Find The Roots Of Equations
     *
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quadratic equation: ax^2 + bx +c ");
        System.out.println("Enter a,b and c Values for quadratic Quations" );
        /**
         * Enter The a,b and C Values For Quadratic Equation ax^2 + bx +c
         */
        double a= scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("Entered quadtratic equation is = "+a +"x^2" + "+" + +b + "x" +"+" +c);
        /**
         * Get Output of Quadractic Equation after entering a, b and c values in Quadractic Equation Formula
         */
        double delta = b*b - 4*a*c;
        /**
         * By Using if-else-if For getting The 2 roots of the equation  can be found using a formula
         *
         */

        if(delta>0) {
            double root1 = (-b + Math.sqrt(delta)) / (2*a);
            double root2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("ROOTS OF THE EQUATION ARE = "+root1 +"," +root2);
        }
        else if(delta==0) {
            double root1=-b / 2*a;
            double root2=-b / 2*a;
            System.out.println("ROOTS OF THE EQUATION ARE = "+root1+ ";" +root2);
        }
        else {
            double root1 = -b / (2*a);
            double root2 = -b / (2*a);
            double imaginar= Math.sqrt(-delta)/(2*a);
            System.out.println("ROOTS OF THE EQUATION ARE = " +root1 + "+" +imaginar + "i" + " "+root1 +"-" +imaginar + "i");
        }
    }
}
