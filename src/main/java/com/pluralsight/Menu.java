package com.pluralsight;

import java.util.Scanner;

public class Menu {

    public static Scanner  input = new Scanner(System.in);
    public static void main(String[] args) {

        for (int i = 0; i < 2;  i++) {
          int chosenOption = displayMenu();
          if(chosenOption == 1){
              System.out.println("You have chosen, Coffee - $3.99");
          }else if(chosenOption == 2){
              System.out.println("You have chosen, Tea - $2.99");
          }else if(chosenOption == 3){
              System.out.println("You have chosen, Cookie - $1.99");
          }
        }
    }

    public static int displayMenu() {

        System.out.println("Welcome to the menu");
        System.out.println("Please enter your choice");
        System.out.println("=== MENU ===");
        System.out.println("1. Coffee - $3.99");
        System.out.println("2. Tea - $2.99");
        System.out.println("3. Cookie - $1.99");

        return input.nextInt();
    }
}
