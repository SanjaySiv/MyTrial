package com.example.helloworld;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        System.out.println("Animals in alphabetical order");
        List<String > list = new LinkedList<>();
        list.add("Mouse");
        list.add("Zebra");
        list.add("Dog");
        list.add("Cat");
        list.add("Elephant");
        list.add("Lion");
        Collections.sort(list);
        for(String animal:list){
            System.out.println(animal);
        }
        System.out.println("numbers ascending order");
        List<Integer > number = new LinkedList<>();
        number.add(7);
        number.add(87);
        number.add(34);
        number.add(18);
        number.add(65);
        number.add(8);
        Collections.sort(number);
        for(Integer num:number){
            System.out.println(num);
        }
    }
}
