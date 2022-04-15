# Implement a class


1. Implement a class School, including the following attributes and methods:

a private attribute name of type String
a setter method setName which expect a parameter name of type String
a getter method getName which expect no parameter and return the name of the school


2. Example:
```java
School school = new School();

school.setName("MST");

System.out.println(school.getName());
```
//if you put the above three statements in the main method, it should return "MST" as a result.



Multiple-choice Question (select one or more from a list of choices):

1. (2 pts) What is list after the following code is executed?
```java
ArrayList<Integer> list = new ArrayList<>();

list.add(1);

list.add(2);

list.add(3);

list.add(4);

list.add(5);

list.remove(2);

System.out.println(list);
```
1. [1, 2, 3, 4, 5]
2. [2, 3, 4, 5]
3. [1, 3, 4, 5]
4. [1, 2, 4, 5]
5. [1, 2, 3, 4]


2. (2 pts) Suppose ArrayList x contains three strings [Beijing, Singapore, Tokyo]. Which of the following methods will cause errors?
```java
get(2);
set(3, "New York");
get(3);
remove(3);
size();
```