package com.example.helloworld;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=ob.nextInt();
        int r;
        //int rev=0;
        while(num>0){
            r=num%10;
            System.out.print(r);
            //rev=(rev*10)+r;
            num=num/10;
        }
        //System.out.println(rev);
    }
}
