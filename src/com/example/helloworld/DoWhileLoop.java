package com.example.helloworld;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String [] args){
        Scanner ob =new Scanner(System.in);

        int num=0;
        do{
            System.out.print("Enter a num : ");
            num= ob.nextInt();
        }while(num!=5);
        System.out.println("Got 5");
    }
}
