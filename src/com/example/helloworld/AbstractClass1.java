package com.example.helloworld;

abstract class Base1{
    Base1(){
        System.out.println("Base constructor");
    }
    abstract void fun();
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("Derived constructor");
    }
    void fun(){
        System.out.println("Derived  function");
    }
}
public class AbstractClass1 {
    public static void main(String [] args) {
        Base1 b = new Derived1();   //calls both constructors
        Derived1 d = new Derived1(); //calls both constructors
        d.fun();
    }
}
