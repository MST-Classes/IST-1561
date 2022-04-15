package me.nhall.lab;

import java.util.ArrayList;

public class Lab8 {

    public static void main(String[] args) {
        //Coding Exercise

        School school = new School();
        school.setName("MST");
        System.out.println(school.getName());

        //Multi Choice Questions
        //#1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(2);
        System.out.println(list);
        // Output = #4 | [1, 2, 4, 5]

        //#2
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Beijing");
        cities.add("Singapore");
        cities.add("Tokyo");
        // Answer = #2, #3, #4

    }

}

class School {

    private String name;

    public School() {

    }

    public School(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
