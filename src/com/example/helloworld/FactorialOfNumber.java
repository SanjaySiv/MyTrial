package com.example.helloworld;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a number to find factorial : ");
        int num = ob.nextInt();
        long fact = 1;
        if (num == 0)
            System.out.println("0! is 1");
        else {
            for (int i = num; i > 0; i--) {
                fact *= i;
            }
            System.out.println(num+"! is "+fact);
        }
    }
}
