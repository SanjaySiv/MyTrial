package com.example.helloworld;

abstract class Base2{
    void fun(){
        System.out.println("Base function");
    }
    final void fun2(){
        System.out.println("Final Base function");
    }
}
class Derived2 extends Base2{
    void fun(){
        System.out.println("derived function");
    }
}
public class AbstractClass2 {
    public static void main(String[] args){
        Derived2 d=new Derived2();
        d.fun();
        d.fun2();
    }
}
