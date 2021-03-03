package com.example.helloworld;

interface Talk{
    String talk(String message);
}
public class LambdaMultipleStmt {
    public static void main(String[] args) {
        Talk t = (message) -> {
            String s1 = "I have only one thing to say, ";
            return s1+message;
        };
        System.out.println(t.talk("Time is precious"));
    }
}
