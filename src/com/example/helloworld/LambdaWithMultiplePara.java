package com.example.helloworld;

interface AddFunction{
    int add(int a,int b);
}
public class LambdaWithMultiplePara {
    public static void main(String[] args){
        AddFunction adding=(a,b)->(a+b);
        System.out.println(adding.add(10,298));
    }
}
