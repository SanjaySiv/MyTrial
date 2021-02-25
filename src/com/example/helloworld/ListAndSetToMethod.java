package com.example.helloworld;

import java.util.*;

public class ListAndSetToMethod {
    public static void main(String [] args){
        List<String>list=new ArrayList<>();
        Set<String>set=new TreeSet<>();
        addElements(set);
        addElements(list);
        System.out.println("Elements of set");
        showElements(set);
        Collections.sort(list);
        System.out.println("Elements of list");
        showElements(list);
    }
    public static void addElements(Collection<String>col){
        col.add("Vijay");
        col.add("Sue");
        col.add("Ajit");
        col.add("Surya");
        col.add("Lal");
    }
    public static void showElements(Collection<String>col){
        for(String name:col){
            System.out.println(name);
        }
    }
}
