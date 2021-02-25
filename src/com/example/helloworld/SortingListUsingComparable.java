package com.example.helloworld;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Employee implements Comparable<Employee>{
    String name;
    int id,age;
    public Employee(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(age,e.age);//to sort in reverse order compare(-age,-e.age)
    }
}
public class SortingListUsingComparable {
    public static void main(String [] args){
        List<Employee> sList = new LinkedList<>();
        sList.add(new Employee(1, "Vijay", 20));
        sList.add(new Employee(2, "Ajay", 25));
        sList.add(new Employee(3, "Ravi", 18));
        sList.add(new Employee(4, "Zain", 29));
        sList.add(new Employee(5, "Babu", 14));
        System.out.println("Sorting by age");
        Collections.sort(sList);
        for(Employee e:sList){
            System.out.println(e);
        }
    }
}
