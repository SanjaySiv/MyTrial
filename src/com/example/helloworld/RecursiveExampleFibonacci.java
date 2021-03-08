package com.example.helloworld;

import java.util.Scanner;

public class RecursiveExampleFibonacci {
    static int n1=0,n2=1,n3=0;
    static void fibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibonacci(count - 1);
        }
    }
    public static void main(String[] args){
        System.out.print("Enter the count of fibonacci numbers needed : ");
        Scanner ob=new Scanner(System.in);
        int count=ob.nextInt();
        System.out.print("Fibonacci series : "+n1+" "+n2);
        fibonacci(count-2);
    }
}
