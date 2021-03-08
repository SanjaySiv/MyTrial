package com.example.helloworld;

import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args){
        short[] s=new short[]{12,34,67,45};
        System.out.println("Actual values");
        for (short sh:s) {
            System.out.println(sh);
        }
        Arrays.fill(s, (short) 15);
        System.out.println("After filling");
        for (short sh:s) {
            System.out.println(sh);
        }
        Arrays.fill(s,1,3, (short) 8);
        System.out.println("After filling");
        for (short sh:s) {
            System.out.println(sh);
        }
    }
}
