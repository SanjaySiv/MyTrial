package com.example.helloworld;

class Machine{
    private String name;
    private int code;

    public Machine(){
        this("Joe");              //calling constructor of same class
        System.out.println("Constructor running");  //non parameterized constructor
    }
    public Machine(String name){                    //parameterized constructor
        this("Sarah",1);    //calling constructor of same class
        System.out.println("Second constructor running");
        this.name=name;
        System.out.println(name);
    }
    public Machine(String name, int code){          //parameterized constructor
        System.out.println("Third constructor running");
        this.name=name;
        this.code=code;
        System.out.println(name+" "+code);
    }
}

public class ConstructorDemo {
    public static void main(String [] args) {
        Machine ob1 = new Machine();
        //Machine ob2 = new Machine("Joe");
        //Machine ob3 = new Machine("Sarah", 1);
    }
}
