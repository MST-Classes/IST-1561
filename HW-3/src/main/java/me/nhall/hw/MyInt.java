package me.nhall.hw;

public class MyInt {

    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is odd? " + n1.isOdd());

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        //System.out.println("n2 is odd? " + MyInteger.isOdd(n2));
        System.out.println("n2 is odd? " + MyInteger.isOdd(n2.getValue())); // Changed so this method & print statement would work correctly
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("The value of n1 is equal to n2? " + n1.equals(n2));
        System.out.println("The value of n1 is equal to 5? " + n1.equals(5));

    }
}

class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return (value % 2) == 0;
    }

    public boolean isOdd() {
        return (value % 2) == 1;
    }


    public static boolean isEven(int value) {
        return (value % 2) == 0;
    }

    public static boolean isOdd(int value) {
        return (value % 2) == 1;
    }

    public boolean equals(int cInt) {
        if (cInt == value)
            return true;
        return false;
    }

    public boolean equals(MyInteger myInt) {
        if (myInt.value == this.value)
            return true;
        return false;
    }
}
