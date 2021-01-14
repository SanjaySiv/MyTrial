package com.example.helloworld;

public class StaticExample {
    int id;
    String name;
    static String college="ITC";
    StaticExample(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id+" "+name+" "+college);
    }
    public static void main(String[] args){
        StaticExample s1=new StaticExample(121,"Karan");
        StaticExample s2=new StaticExample(122,"Aryan");
        s1.display();
        s2.display();
    }
}
