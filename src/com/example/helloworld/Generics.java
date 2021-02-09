package com.example.helloworld;

import java.util.ArrayList;

class Machines{
    @Override
    public String toString() {
        return "Machines";
    }
}
class Cameras{

}
public class Generics {
    public static void main(String[] args){
        ArrayList<Machines>list=new ArrayList<>();
        list.add(new Machines());
        list.add(new Machines());
        showList(list);
    }
    public static void showList(ArrayList<Machines>list){
        for(Machines str:list){
            System.out.println(str);
        }
    }
}
