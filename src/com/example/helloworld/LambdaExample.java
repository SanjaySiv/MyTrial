package com.example.helloworld;

public class LambdaExample {
    interface FuncInt1{
        int operation(int a,int b);
    }
    interface FuncInt2{
        void sayMessage(String message);
    }
        int operate(int a,int b,FuncInt1  obj){
            return obj.operation(a,b);
    }
    public static void main(String [] args){
        LambdaExample lambda=new LambdaExample();
        FuncInt1  add=(a,b)->a+b;
        FuncInt1 multi=(a,b)->a*b;
        FuncInt1 div=(a,b)->a/b;
        FuncInt1 sub=(a,b)->a-b;
        System.out.println(lambda.operate(5,7,add));
        System.out.println(lambda.operate(6,9,multi));
        System.out.println(lambda.operate(90,9,div));
        System.out.println(lambda.operate(19,45,sub));
        FuncInt2 f=message -> System.out.println("Hello "+message);
        f.sayMessage("Good morning");
    }
}