package me.nhall.hw;

import java.util.Scanner;

public class InvestingHomework {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Investment Amount:");
        double investAmount = sc.nextDouble();

        System.out.print("Enter annual interest rate:");
        double intRate = sc.nextDouble();
        intRate /= 1200;

        System.out.print("Enter number of years:");
        int years = sc.nextInt();

        double investValue = investAmount * Math.pow(1 + intRate, years * 12);
        System.out.print("Accumulated value is: ");
        System.out.printf("%.2f", investValue);


    }
}
