package com.example.helloworld;

import java.util.function.BiFunction;

class Arithmetics{
    public int add(int a,int b){
        return a+b;
    }
    public float add(int a,float b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
}
public class MethodReferenceInstanceBiFunction {
    public static void main(String[] args){
        BiFunction<Integer,Integer,Integer>intInt=new Arithmetics()::add;
        BiFunction<Integer,Float,Float>intFloat=new Arithmetics()::add;
        BiFunction<Float,Float,Float>floatFloat=new Arithmetics()::add;
        System.out.println(intInt.apply(34,66));
        System.out.println(intFloat.apply(34,67.76f));
        System.out.println(floatFloat.apply(34.65f,56.78f));

    }
}
