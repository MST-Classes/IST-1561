package me.nhall.hw;

import java.util.Scanner;

public class MaxValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numbers:");
        int max = sc.nextInt();
        int count = 1;
        int num = sc.nextInt();

        while (num > 0) {
            if (num == max) {
                count++;
            }
            if (num > max) {
                max = num;
                count = 1;
            }
            num = sc.nextInt();
        }
        System.out.println("The largest number is: " + max);
        System.out.println("The occurrence count of the largest number is: " + count);
    }
}
