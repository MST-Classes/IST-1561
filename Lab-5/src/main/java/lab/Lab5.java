package lab;

public class Lab5 {

    public static void main(String[] args) {
        System.out.print("My first input is 'a', the output is: "+ convertChar('a'));
        System.out.print("My second input is '%', the output is: "+ convertChar('%'));
        System.out.print("My third input is 'X', the output is: "+ convertChar('X'));
    }

    public static int convertChar(char c) {
        return Character.getNumericValue(c);
    }
}
