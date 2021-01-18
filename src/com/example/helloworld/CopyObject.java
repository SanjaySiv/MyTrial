package com.example.helloworld;

public class CopyObject {
    String name;
    int id,age;
    CopyObject(){}
    CopyObject(int id,String name,int age){
        this.id=id;
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("ID : "+id+"| Name : "+name+" | Age : "+age);
    }
    public static void main(String[] args){
        CopyObject c1=new CopyObject(1,"Ajay",20);
        CopyObject c2=new CopyObject();
        c2.id=c1.id;
        c2.name= c1.name;
        c2.age= c1.age;
        c1.display();
        c2.display();
    }
}
