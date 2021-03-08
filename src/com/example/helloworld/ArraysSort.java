package com.example.helloworld;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysSort {
    public static void main(String[] args){
        Comparator<Integer>comp= Collections.reverseOrder();
        Object[] ob=new Object[]{"hi","hello"};
        Arrays.sort(ob);
        for(Object o:ob){
            System.out.println(o);
        }
        Integer[] i=new Integer[]{1,7,3,0,2,6};
        Arrays.sort(i,comp);
        for(int in:i){
            System.out.println(in);
        }
        double[] d={12.4,56.8,345,8.43,342.2,12.67};
        Arrays.sort(d,1,4);
        for(double dou:d){
            System.out.println(dou);
        }
        Character[] sh={'a','r','y','i'};
        Comparator<Character>cmp1=Collections.reverseOrder();
        Arrays.sort(sh,1,4,cmp1);
        for(char ch1:sh){
            System.out.println(ch1);
        }
    }
}
