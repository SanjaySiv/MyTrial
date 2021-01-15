package com.example.helloworld;

class Function{
    String name;
    int id;
    static String college="ITS";
    Function(int id,String  name){
        this.id=id;
        this.name=name;
    }
    static void change(){
        college="BBDIT";
    }
    void display(){
        System.out.println(id+" "+name+" "+college);
    }
}

public class StaticFunction {

    public static void main(String[] args){
        Function s1=new Function(111,"Karan");
        s1.display();
        Function.change();
        Function s2=new Function(112,"Naveen");
        Function s3=new Function(123,"Aryan");
        s2.display();
        s3.display();
    }
}
