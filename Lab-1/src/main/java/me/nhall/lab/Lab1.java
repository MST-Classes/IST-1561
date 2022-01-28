package me.nhall.lab;

public class Lab1 {

    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        StringBuilder printMe = new StringBuilder();

        for (char c : chars) {
            printMe.append(c);
        }
        System.out.println(printMe);
        System.out.println("This is Nolan's first java program!");
    }
}
