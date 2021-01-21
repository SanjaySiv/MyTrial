package com.example.helloworld;


class Adder{

    static int add(int a,int b) {
        return a+b;
    }
    /*static double add(int a,int b) {
        return a+b;
    }*/  //compiler error due to same functions and same argument
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static double add(double a,double b,int c){
        return a+b+c;
    }
}
public class MethodOverloading {

    public static void main(String[] args){
        System.out.println(Adder.add(1,2));
        System.out.println(Adder.add(1,2,3));   //overloading depending on the  um of arguments
        System.out.println(Adder.add(145.36,2.54,58));  //overloading depending on the type of arguments
    }
}
