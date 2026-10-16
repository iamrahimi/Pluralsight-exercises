package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        System.out.println("Payroll Calculator");
        String employeeName;
        float employeeHoursWorked;
        float payRatePerHour;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        employeeName = input.nextLine();
        System.out.println("Enter your hours worked: ");
        employeeHoursWorked = input.nextFloat();
        System.out.println("Enter your pay rate per hour: ");
        payRatePerHour = input.nextFloat();

        double[] calculateValue = calculate(employeeHoursWorked, payRatePerHour);
        payrollDisplay(employeeName, employeeHoursWorked, payRatePerHour, calculateValue);

    }

    public static double[] calculate(double employeeHoursWorked, double payRatePerHour){
        double grossPay = 0;
        double overTimePay = 0;
        if(employeeHoursWorked <= 40) {
            grossPay = employeeHoursWorked * payRatePerHour;
        } else {
            grossPay = 40 * payRatePerHour + employeeHoursWorked;
            overTimePay = (employeeHoursWorked - 40) * (payRatePerHour * 1.5);
        }

        double total = overTimePay + grossPay;
        return new double[]{overTimePay, grossPay, total};
    }

    public static void payrollDisplay(String employeeName, float employeeHoursWorked, float payRatePerHour, double calculatedPayroll[]){
        System.out.println("========Payroll Calculator=========");
        System.out.println("========Payroll Start =============");
        System.out.println("==::-> Employee Name: " + employeeName);
        System.out.println("==::-> Employee Hours Worked: H" + employeeHoursWorked);
        System.out.println("==::-> Pay Rate: $" + payRatePerHour);
        System.out.println("==::-> Calculated gross pay: " + calculatedPayroll[1]);
        System.out.println("==::-> Calculated overtime: " + calculatedPayroll[0]);
        System.out.println("==::-> Calculated total: " + calculatedPayroll[2]);
        System.out.println("========Payroll End ==============");
    }
}
