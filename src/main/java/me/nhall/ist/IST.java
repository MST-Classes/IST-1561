package me.nhall.ist;

public class IST {

    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
        StringBuilder printMe = new StringBuilder();

        for (char c : chars) {
            printMe.append(c);
        }
        System.out.println(printMe);

    }
}
