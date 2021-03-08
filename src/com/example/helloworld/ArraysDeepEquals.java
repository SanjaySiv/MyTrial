package com.example.helloworld;

import java.util.Arrays;

public class ArraysDeepEquals {
    public static void main(String[] args){
        Object[] b1=new Object[]{'a','b'};
        Object[] b2=new Object[]{'a','b'};
        Object[] b3=new Object[]{'x','y'};
        System.out.println(Arrays.deepEquals(b1,b2));
        System.out.println(Arrays.deepEquals(b1,b3));
    }
}