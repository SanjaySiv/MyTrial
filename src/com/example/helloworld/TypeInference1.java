package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class TypeInference1 {
    public static void showList(List<Integer>list){
        if(!list.isEmpty()) {
            list.forEach(System.out::println);
        }
        else{
            System.out.println("Empty list");
        }
    }
    public static void main(String[] args){
        List<Integer>list1=new ArrayList<>();
        list1.add(7);
        showList(list1);
        List<Integer>list2=new ArrayList<>();
        list2.add(8);
        showList(list2);
        showList(new ArrayList<>());
    }
}
