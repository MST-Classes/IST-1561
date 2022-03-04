package me.nhall.lab;

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {

        double mass, force, angle;
        double g = 9.8;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the mass of the cart: ");
        mass = sc.nextDouble();

        System.out.print("Enter force to push the cart: ");
        force = sc.nextDouble();

        angle = Math.toDegrees(Math.asin(force / (mass * g)));
        angle = (double) Math.round(angle * 100) / 100;
        System.out.println("The angle of the ramp is: " + angle + " degrees");

    }

}
