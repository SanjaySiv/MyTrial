package com.example.helloworld;

public class Constructor3 {
    int age,id;
    String name;
    Constructor3(int id,String name){
        this.id=id;
        this.name=name;
    }
    Constructor3(int id,int age,String name){
        this(id,name);
        this.age=age;
    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }
    public static void main(String[] args){
        Constructor3 c1=new Constructor3(111,"Joe");
        Constructor3 c2=new Constructor3(222,21,"Sarah");
        c1.display();
        c2.display();
    }
}
