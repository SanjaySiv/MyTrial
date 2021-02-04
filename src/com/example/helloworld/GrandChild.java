package com.example.helloworld;
class GrandParent{
    public void features(){
        System.out.println("features of grand parent");
    }
}
class Parent extends GrandParent{
    public void features(){
        System.out.println("features of parent");
    }
}
public class GrandChild extends Parent{
    public static void main(String[] args){
        GrandParent g=new GrandChild();
        g.features();
    }
}
