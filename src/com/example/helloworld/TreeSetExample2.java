package com.example.helloworld;

import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String [] args){
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Vijay");
        treeSet.add("Ajit");
        treeSet.add("Ravi");
        treeSet.add("Balu");
        treeSet.add("Chetan");
        treeSet.add("Zain");
        System.out.println("NavigableSet operations");
        System.out.println("Initial Set : "+treeSet);
        System.out.println("Reverse set : "+ treeSet.descendingSet());
        System.out.println("HeadSet : "+treeSet.headSet("Balu",false));
        System.out.println("Subset : "+treeSet.subSet("Ajit",false,"Chetan",false));
        System.out.println("tailSet : "+treeSet.tailSet("Ravi",true));
        System.out.println("SortedSet operations");
        System.out.println("Initial Set : "+treeSet);
        System.out.println("HeadSet : "+treeSet.headSet("Balu"));
        System.out.println("Subset : "+treeSet.subSet("Ajith","Chetan"));
        System.out.println("tailSet : "+treeSet.tailSet("Ravi"));

    }
}
