package com.example.helloworld;

import java.util.Arrays;

public class ArraysDeepToString {
    public static void main(String[] args){
        Object[] ob={"tuts","point"};
        for (Object o:ob) {
            System.out.println(o);
        }
        System.out.print("String representation is ");
        System.out.println(Arrays.deepToString(ob));
    }
}
