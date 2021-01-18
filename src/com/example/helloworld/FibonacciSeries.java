package com.example.helloworld;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter count of Fibonacci numbers needed : ");
        int num=ob.nextInt();
        int n1=0,n2=1,sum;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<num;i++){
            sum=n1+n2;
            n1=n2;
            n2=sum;
            System.out.print(sum+" ");
        }
    }
}
