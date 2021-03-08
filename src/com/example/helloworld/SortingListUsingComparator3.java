package com.example.helloworld;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortingListUsingComparator3 {
    public static void main(String[] args) {
    List<Student> sList = new LinkedList<>();
        sList.add(new Student(1, "Vijay", 20));
        sList.add(new Student(2, "Ajay", 25));
        sList.add(new Student(3, "Ravi", 18));
        sList.add(new Student(4, "Zain", 29));
        sList.add(new Student(5, "Babu", 14));
        System.out.println("Sorting by age");
        sList.sort(new Comparator<>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.age, s2.age);
            }
        });
        for (Student s : sList)
            System.out.println(s.id + " " + s.name + " " + s.age);
    }
}
