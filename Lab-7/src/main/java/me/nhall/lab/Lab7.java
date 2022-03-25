package me.nhall.lab;

import java.util.Scanner;

public class Lab7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intList = new int[20];
        int numLength;

        numLength = sc.nextInt();

        for (int i = 0; i < numLength; i++) {
            intList[i] = sc.nextInt();
        }
        for (int i = numLength - 1; i >= 0; i--) {
            System.out.print(intList[i] + " ");
        }
    }

}
