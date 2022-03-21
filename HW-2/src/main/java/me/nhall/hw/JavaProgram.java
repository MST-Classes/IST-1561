package me.nhall.hw;

public class JavaProgram {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {

            //#1
            // y= x - y;
            // 00 11 21 32 42 ---- E

            //#2
            // y = y + x;
            // 00 11 23 36 410 ---- G

            //#3
            //y = y + 2;
            //if (y > 4) {
            //y = y - 1;
            //}
            // 02 14 25 36 47 ---- H

            //#4
            // = x + 1;
            //y = y + x;
            // 11 34 59 ---- B

            //#5
            //if (y < 5) {
            //    x = x + 1;
            //    if (y < 3) {
            //        x = x - 1;
            //    }
            // }
            //y = y + 2;
            //02 14 36 48 ---- D

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
