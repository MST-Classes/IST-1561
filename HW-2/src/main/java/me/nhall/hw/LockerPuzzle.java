package me.nhall.hw;

public class LockerPuzzle {

    public static void main(String[] args) {

        boolean[] locker = new boolean[101];

        for (int i = 1; i < locker.length; i++) {
            locker[i] = false;
        }
        for (int i = 1; i < locker.length; i++) {
            locker[i] = true;
        }
        for (int S = 2; S < locker.length; S++) {
            for (int k = S; k < locker.length; k = k + S) {
                locker[k] = !locker[k];
            }
        }
        for (int S = 1; S < locker.length; S++) {
            if (locker[S]) System.out.println("Locker " + S + " Open");
        }
    }


}

