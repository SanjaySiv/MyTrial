package com.example.helloworld;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String [] args){
        LinkedHashSet<String>linked=new LinkedHashSet<>();
        linked.add("Banana");
        linked.add("Apple");
        linked.add("Grape");
        linked.add("Orange");
        linked.add("Pineapple");
        for(String fruit:linked){
            System.out.println(fruit);
        }
        linked.remove("Banana");
        System.out.println("After removing Banana : ");
        for(String fruit:linked){
            System.out.println(fruit);
        }
        HashSet<String>set=new HashSet<>(linked);
        System.out.println(set);
    }
}
