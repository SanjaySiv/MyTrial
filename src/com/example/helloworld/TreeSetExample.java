package com.example.helloworld;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args){
        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("Vijay");
        treeSet.add("Ajit");
        treeSet.add("Ravi");
        treeSet.add("Balu");
        treeSet.add("Chetan");
        treeSet.add("Zain");
        System.out.println("Traversing in ascending order");
        for(String name:treeSet){
            System.out.println(name);
        }
        System.out.println("Traversing in descending order");
        Iterator<String>itr=treeSet.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("Removing first and last elements");
        treeSet.pollFirst();//retrieve and remove first element
        treeSet.pollLast();//retrieve and remove lat element
        for(String name:treeSet){
            System.out.println(name);
        }
    }
}
