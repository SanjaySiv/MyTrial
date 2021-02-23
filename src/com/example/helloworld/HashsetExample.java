package com.example.helloworld;

import java.util.HashSet;

public class HashsetExample {
    public static void main(String[] args){
        HashSet<String>set=new HashSet<>();
        set.add("Mango");
        set.add("Apple");
        set.add("Orange");
        set.add("grape");
        set.add("Watermelon");
        System.out.println(set);
        set.add("Apple");//duplicate value
        set.remove("grape");
        System.out.println(set);
        HashSet<String>set1=new HashSet<>();
        set1.add("Grape");
        set1.add("Apple");
        set1.add("Guava");
        set1.add("Pineapple");
        System.out.println(set1);
        System.out.println("Union");
        HashSet<String>union=new HashSet<>(set);
        union.addAll(set1);
        System.out.println(union);
        System.out.println("Intersection");
        HashSet<String>intersection=new HashSet<>(set);
        intersection.retainAll(set1);
        System.out.println(intersection);
        System.out.println("Difference");
        HashSet<String>difference=new HashSet<>(set);
        difference.removeAll(set1);
        System.out.println(difference);
    }
}
