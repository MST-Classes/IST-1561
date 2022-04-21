# HW3

## Multiple Choice Questions

These questions are multiple-choice questions that ask you to select one or more answer
choices from a list of choices. A question may not specify the number of choices to select.

1. _________ is invoked to create an object.
   a. A constructor
   b. The main method
   c. A method with a return type
   d. A method with the void return type
2. Given the declaration Circle x = new Circle(), which of the following statement is most
   accurate.
   a. x contains an int value.
   b. x contains an object of the Circle type.
   c. x contains a reference to a Circle object.
   d. You can assign an int value to x.
3. The default value for data field of a boolean type, numeric type, object type is _________,
   respectively.
   a. true, 1, Null
   b. false, 0, null
   c. true, 0, null
   d. true, 1, null
   e. false, 1, 0
4. In the implementation of MyArrayList, which of the following are true?
   a. size indicates the number of elements in the list.
   b. capacity is the length of the array used to store the elements in the list.
   c. capacity is always greater than size.
   d. size is reduced by 1 if an element is deleted from the list.
   e. capacity is reduced by 1 if an element is deleted from the list.
5. In the implementation of MyArrayList, which of the following are true?
   a. size never reduces.
   b. capacity never reduces.
   c. Inside MyArrayList, a regular array is used to store elements.
   d. If the current capacity equals to size, capacity is doubled when a new element is
   added to MyArrayList

## The MyInteger Class

Problem Description:
Design a class named MyInteger. The class contains:
• A private int data field named value that stores the int
value represented by this object.
• A constructor that creates a MyInteger object for the
specified int value.
• A get method that returns the int value.
• Methods isEven() and isOdd() that return true if the value
is even or odd respectively.
• Static methods isEven(int)and isOdd(int) that return true
if the specified value is even or odd respectively.
• Static methods isEven(MyInteger)and isOdd(MyInteger) that
return true if the specified value is even or odd
respectively.
• Methods equals(int) and equals(MyInteger) that return true
if the value in the object is equal to the specified value.
Implement the class. Write a client program that tests all
methods in the class.
Coding: (Copy and Paste Source Code here. The template is provided.)

```JAVA
public class ExerciseHW5 {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is odd? " + n1.isOdd());

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("n2 is odd? " + MyInteger.isOdd(n2));
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("The value of n1 is equal to n2? " + n1.equals(n2));
        System.out.println("The value of n1 is equal to 5? " + n1.equals(5));
    }
}

class MyInteger {
// Implement your class here
}
```

Testing: (Paste the screenshot of your result here.)