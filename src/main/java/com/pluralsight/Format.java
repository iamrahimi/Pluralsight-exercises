package com.pluralsight;

import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Format");
        System.out.println("Please enter your First Name:");
        String firstName = input.nextLine();
        System.out.println("Please enter your Last Name:");
        String lastName = input.nextLine();

        String NameFormat = formatName(firstName,lastName);
        System.out.println("Your full name is:" + NameFormat);
    }


    public  static String formatName(String first, String last) {
        return last + " " + first;
    }
}
