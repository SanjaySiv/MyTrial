package com.example.helloworld;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {
    public static void main(String [] args){
        List<String>list=new LinkedList<>();
        list.add("Vijay");
        list.add("Sam");
        list.add("Ajit");
        list.add("Babu");
        list.add("Ram");
        System.out.println("The lis is : "+list);
        Iterator<String>itr=list.iterator();
        System.out.println("Iterating though list");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("After removing last element");
        itr.remove();
        System.out.println(list);
    }
}
