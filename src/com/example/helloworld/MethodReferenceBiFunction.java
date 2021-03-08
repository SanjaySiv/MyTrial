package com.example.helloworld;

import java.util.function.BiFunction;

class Arithmetic{
    public static int adder(int a,int b){
        return a+b;
    }
    public static float adder(int a,float b){
        return a+b;
    }
    public static float adder(float a,float b){
        return a+b;
    }
}
public class MethodReferenceBiFunction {
    public static void main(String [] args){
        BiFunction<Integer,Integer,Integer>intInt=Arithmetic::adder;
        BiFunction<Integer,Float,Float>intFloat=Arithmetic::adder;
        BiFunction<Float,Float,Float>floatFloat=Arithmetic::adder;
        System.out.println(intInt.apply(17,93));
        System.out.println(intFloat.apply(13,54.67f));
        System.out.println(floatFloat.apply(23.45f,34.65f));
    }
}
