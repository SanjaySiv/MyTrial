package com.example.helloworld;

import java.util.Scanner;

public class ExceptionThrow {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not valid");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age=ob.nextInt();
        validate(age);
        System.out.println("rest of the code");
    }
}
