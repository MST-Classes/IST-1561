package me.nhall.lab;

public class Lab9 {

    public static void main(String[] args) {
        Student student = new Student("Joe");

        student.setScore(10);
        System.out.println(student.getLevel());

        student.setScore(60);
        System.out.println(student.getLevel());
    }
}

class Student {

    private String name;
    private int score;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }


    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public char getLevel() {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 60) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
