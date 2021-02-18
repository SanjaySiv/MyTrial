package com.example.helloworld;

import java.util.Scanner;

public class RecursiveExampleFactorial {
    private static int factorial(int number){
        if(number==0 || number==1)
            return 1;
        return factorial(number-1)*number;
    }
    public static void main(String[] args){
        System.out.print("Enter a number to find factorial : ");
        Scanner ob=new Scanner(System.in);
        int inputNumber=ob.nextInt();
        System.out.println(inputNumber+"! is "+factorial(inputNumber));
    }
}
