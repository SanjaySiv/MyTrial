package com.example.helloworld;

import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args){
        String[] a=new String[]{"abc","efg","hij"};
        List list= Arrays.asList(a);
        System.out.println(list);
    }
}
