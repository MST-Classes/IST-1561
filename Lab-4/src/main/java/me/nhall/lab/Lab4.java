package me.nhall.lab;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smallNum;

        System.out.println("Please enter 3 integers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 <= num2 && num1 <= num3) {
            smallNum = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallNum = num2;
        } else {
            smallNum = num3;
        }

        System.out.println("The smallest number is " + smallNum);
    }
}
