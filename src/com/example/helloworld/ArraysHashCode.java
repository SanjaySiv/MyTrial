package com.example.helloworld;

import java.util.Arrays;

public class ArraysHashCode {
    public static void main(String [] args){
        float[] f=new float[]{12.34f,4.55f,6.78f,3.54f};
        System.out.println(Arrays.hashCode(f));
        char[] c1=new char[]{'a','b','c'};
        System.out.println(Arrays.hashCode(c1));
        char[] c=new char[]{'a','b','c'};
        System.out.println(Arrays.hashCode(c));
    }
}
