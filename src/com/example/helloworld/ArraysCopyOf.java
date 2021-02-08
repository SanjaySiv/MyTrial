package com.example.helloworld;

import java.util.Arrays;

public class ArraysCopyOf {
    public static void main(String[] args){
        boolean[] arr1=new boolean[]{true,false};
        for(boolean ar:arr1){
            System.out.println(ar);
        }
        System.out.println();
        boolean[] arr2= Arrays.copyOf(arr1,4);
        for(boolean ar:arr2){
            System.out.println(ar);
        }
        System.out.println();
        boolean[] arr3= Arrays.copyOfRange(arr1,1,4);
        for(boolean ar:arr3){
            System.out.println(ar);
        }
    }
}
