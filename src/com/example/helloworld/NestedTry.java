package com.example.helloworld;

import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("enter a num");
        int n=ob.nextInt();
        try{
            try {
                System.out.println("Dividing");
                int b = 87 / n;
            }catch (ArithmeticException e) {
                System.out.println("Divided by zero");
            }
            try{
                int[] a=new int[5];
                a[n]=6;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound");
            }
        }catch (Exception e){
            System.out.println("Handled");
        }
        System.out.println("Finished");
    }
}
