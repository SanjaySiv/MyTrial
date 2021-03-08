package com.example.helloworld;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        try{
            int i=100/a;
            System.out.println(i);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
        System.out.println("entered value is "+a);
    }
}
