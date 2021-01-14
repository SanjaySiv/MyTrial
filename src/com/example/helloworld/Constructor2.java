package com.example.helloworld;

public class Constructor2 {
    int id;
    String name;
    Constructor2(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args){
        Constructor2 c1=new Constructor2(111,"Joe");
        Constructor2 c2=new Constructor2(222,"Sarah");
        c1.display();
        c2.display();
    }
}
