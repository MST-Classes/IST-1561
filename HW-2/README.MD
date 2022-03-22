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


## Locker Puzzle