package com.example.helloworld;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingListUsingComparator5 {
    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        sList.add(new Student(1, "Vijay", 20));
        sList.add(new Student(2, "Ajay", 25));
        sList.add(new Student(3, "Ravi", 18));
        sList.add(new Student(7, null, 10));
        //exception occurs when we sort by name
        sList.add(new Student(4, "Zain", 29));
        sList.add(new Student(5, "Babu", 14));
        System.out.println("Sorting by name nullsFirst");
        Comparator<Student> cm1 = Comparator.comparing(Student::getName,Comparator.nullsFirst(String::compareTo));
        sList.sort(cm1);
        for (Student s : sList) {
            System.out.println(s);
        }
        System.out.println("Sorting by name nullsLast");
        Comparator<Student> cm2 = Comparator.comparing(Student::getName,Comparator.nullsLast(String::compareTo));
        sList.sort(cm2);
        for (Student s : sList) {
            System.out.println(s);
        }
    }
}
