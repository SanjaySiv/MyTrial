package com.example.helloworld;

interface SaySomething{
    void say();
}
public class LambdaWithoutPara {
    public static void main(String[] args){
        SaySomething some=()->System.out.println("Nothing to say");
        some.say();
    }

}
