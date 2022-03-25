# Output numbers in reverse

Write a program that reads a list of integers from the keyboard and outputs those integers in reverse. The input begins with an integer indicating the number of integers that follow. For coding simplicity, follow each output integer by a comma, including the last one. Assume that the list will always contain fewer than 20 integers.

####Example 1: If the input is:

5 2 4 6 8 10

the output is:

10, 8, 6, 4, 2,

####Example 2: If the input is:

6 42 53 19 18 100 12

the output is:

12, 100, 18, 19, 53, 42,

(To achieve the above, first read the integers into an array. Then output the array in reverse.)



####You can use the following defualt template:

```java
import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userList = new int[20];   // List of numElement integers specified by the user
      int numElements;                // Number of integers in user's list
      // Add more variables as needed

      numElements = scnr.nextInt();   // Input begins with number of integers that follow
      
      /* Type your code here. (Get user's integers, and then output those integers in reverse) */
   }
}
```

The method to submit your assignment. 

Submit a .java file.