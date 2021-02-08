package com.example.helloworld;

import java.util.Arrays;

public class ArraysDeepHashCode {
    public static void main(String[] args){
        Object[] ob={"tuts","point"};
        Object[] o=new Object[]{"tut","point"};
        System.out.println(Arrays.deepHashCode(ob));
        System.out.println(Arrays.deepHashCode(o));
    }
}
