package com.example.helloworld;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionArraylist {
    public static void main(String[] args){
        ArrayList<String> list= new ArrayList<>();
        list.add("Vijay");
        list.add("Ajay");
        list.add("Vijay");
        list.add("Ravi");
        System.out.println("Printing list using foreach");
        for(String name:list){
            System.out.println(name);
        }
        list.remove(1);
        System.out.println("Printing list using iterator");
        Iterator itr= list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
