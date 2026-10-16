package com.pluralsight;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class RentalCarCalculator {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Rental Car");
        String[] information = collectInformation();
        String[] confirmation = gpsRideAssistanceTollTagConfirmation();
        calculateRentalCar(information, confirmation);

    }

    public static String[] collectInformation() {
        Scanner input = new Scanner(System.in);
        System.out.println("When did you plan to rent the car? ");
        String rentDate = input.nextLine();
        System.out.println("How many days would you like to rent?");
        String days = input.nextLine();
        System.out.println("May I know your age, we also have a discount for certain age? ");
        String age = input.nextLine();

        return new String[]{rentDate, days, age};
    }

    public static String[] gpsRideAssistanceTollTagConfirmation() {

        String electronicToll = "No";
        String gps = "No";
        String roadsideAssistance = "No";

        System.out.println("Do you want the electronic toll tag included, which costs $3.95/Day?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        String answer = input.nextLine();
        electronicToll = (answer.equals("1") || answer.equalsIgnoreCase("Yes")) ? "Yes" : "No";

        System.out.println("Do you want the GPS included, which costs $2.95/Day?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        answer = input.nextLine();
        gps = (answer.equals("1") || answer.equalsIgnoreCase("Yes")) ? "Yes" : "No";

        System.out.println("Do you want roadside assistance included, which costs $3.95/Day?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        answer = input.nextLine();
        roadsideAssistance = (answer.equals("1") || answer.equalsIgnoreCase("Yes")) ? "Yes" : "No";

        return new String[]{electronicToll, gps, roadsideAssistance};

    }

    public static void calculateRentalCar(String[] information, String[] confirmation) {
        double basicRentalPrice = 29.99;
        int rentalDays = (Integer.parseInt(information[1])  <= 0) ? 1 : Integer.parseInt(information[1]);
        double tollPrice = (confirmation[0] == "Yes") ? 3.95 : 0.0;
        double gpsPrice = (confirmation[1] == "Yes") ? 2.95 : 0.0;
        double roadAssistancePrice = (confirmation[2] == "Yes") ? 3.95 : 0.0;
        double discountRate = (Integer.parseInt(information[2]) < 25 ) ? 0.30 : 1;
        double carRentalPrice = basicRentalPrice * Integer.parseInt(information[1]);

        double total = (basicRentalPrice  * Integer.parseInt(information[2]));

        System.out.println("============RENTAL CAR APPLICATION================");
        System.out.println("==== Planned date: " + information[0]);
        System.out.println("==== Days requested: " + rentalDays);
        System.out.println("==== GPS Included: " + gpsPrice);
        System.out.println("==== Toll included: " + tollPrice);
        System.out.println("==== Roadside Assistance: " + roadAssistancePrice);
        System.out.println("==== Discount Rate: " + discountRate);
        System.out.println("==== Car Rental Price: " + carRentalPrice);
        System.out.println("==== Total Rental Price: " + total);
        System.out.println("===================================================");


    }





}
