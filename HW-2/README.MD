# HW-2

## Java Program

One block of the program is missing. Your challenge is to match the candidate block of code, with the output that you’d
see if the block were inserted. Not all the lines of output will be used, and some of the lines of output might be used
more than once. Connect the candidate blocks of code with their matching command-line output.

```java
class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            
            /*
            <INSERT CANIDATE CODE HERE>
            */

            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
```

#### Candidates

1. ```y = x – y;```
2. ``` y= y+x```
3.
```java
        y=y+2;
        if(y>4){
            y=y-1
        }
```
4.
```java
x = x + 1;
y = y + x;
```
5.
```java
if (y < 5) {
    x = x + 1;
    if (y < 3) {
        x = x – 1;
    }
}
y = y + 2;
```

#### Possible output:

A. 22 46

B. 11 34 59

C. 02 14 26 38

D. 02 14 36 48

E. 00 11 21 32 42

F. 11 21 32 42 53

G. 00 11 23 36 410

H. 02 14 25 36 47


#### Answers
1.  E 
2.  G 
3.  H 
4.  B 
5.  D

## Max Value
#### Problem Description:
Write a program that reads integers, finds the largest of them, and counts its occurrences.
Assume that the input ends with number 0. Suppose that you entered 3 5 2 5 5 5 0; the 
program finds that the largest is 5 and the occurrence count for 5 is 4. (Hint: Maintain 
two variables, max and count. max stores the current max number, and count stores its 
occurrences. Initially, assign the first number to max and 1 to count. Compare each 
subsequent number with max. If the number is greater than max, assign it to max and 
reset count to 1. If the number is equal to max, increment count by 1.

#### Samples

#####Sample 1:
Enter numbers: `3 5 2 5 5 5 0`

The largest number is 5

The occurrence count of the largest number is 4

#####Sample 2:
Enter numbers: 3 6 5 4 2 4 5 4 5 5 0

The largest number is 6

The occurrence count of the largest number is

## Locker Puzzle

A school has 100 lockers and 100 students. All lockers are closed on the first day of 
school. As the students enter, the first student, denoted S1, opens every locker. Then the 
second student, S2, begins with the second locker, denoted L2, and closes every other 
locker. Student S3 begins with the third locker and changes every third locker (closes it if 
it was open, and opens it if it was closed). Student S4 begins with locker L4 and changes 
every fourth locker. Student S5 starts with L5 and changes every fifth locker, and so on, 
until student S100 changes L100.

After all the students have passed through the building and changed the lockers, which 
lockers are open? Write a program to find your answer. The program should display the answer like this: 

Locker x is open

Locker y is open

…

Locker z is open

(Hint: Use an array of 100 boolean elements, each of which indicates whether a locker is 
open (true) or closed (false). Initially, all lockers are closed.)