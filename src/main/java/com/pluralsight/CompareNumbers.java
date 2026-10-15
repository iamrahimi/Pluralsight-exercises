package com.pluralsight;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite number: ");
        int favoriteNumber = input.nextInt();

        System.out.println("Number checking of even:" + isEven(favoriteNumber));
        System.out.println("Number checking of positive:" + isPositive(favoriteNumber));

    }

    public static boolean isEven(int number) {
       if (number % 2 == 0) {
           return true;
       }else {
           return false;
       }
    }

    public static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        }else {
            return false;
        }
    }
}
