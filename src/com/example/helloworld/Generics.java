package com.example.helloworld;

import java.util.ArrayList;

class Machines{
    @Override
    public String toString() {
        return "Machines";
    }
}
class Cameras extends Machines{
    @Override
    public String toString() {
        return "Cameras";
    }
}
public class Generics {
    public static void main(String[] args){
        ArrayList<Machines>list1=new ArrayList<>();
        list1.add(new Machines());
        list1.add(new Machines());
        showList(list1);//superclass list

        ArrayList<Cameras>list2=new ArrayList<>();
        list2.add(new Cameras());
        list2.add(new Cameras());
        showList(list2);//subclass list
    }
    public static void showList(ArrayList<?>list){
        for(Object str:list){
            System.out.println(str);
        }
    }
}
