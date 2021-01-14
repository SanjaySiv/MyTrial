package com.example.helloworld;

public class CopyConstructor {
    int id;
    String name;
    CopyConstructor(){}
    CopyConstructor(int id,String name){
        this.id=id;
        this.name=name;
    }
    CopyConstructor(CopyConstructor c){
        id=c.id;
        name=c.name;
    }
    void display(){
    System.out.println(id+" "+name);
    }
    public static void main(String [] args){
        CopyConstructor c1=new CopyConstructor(111,"Joe");
        CopyConstructor c2=new CopyConstructor(c1); //using java constructor
        CopyConstructor c3=new CopyConstructor();
        c3.id= c2.id;       //without using constructor
        c3.name= c2.name;
        c1.display();
        c2.display();
        c3.display();
    }
}
