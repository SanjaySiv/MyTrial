package com.example.helloworld;

import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args){
        double[] d1=new double[]{2.34,45.45,98.3};
        double[] d2=new double[]{1.234,76.89,43.23};
        double[] d3=new double[]{2.34,45.45,98.3};
        int[] i=new int[]{1,5,45};
        Object[] ob1=new Object[]{12,345};
        Object[] ob2=new Object[]{12,345};
        System.out.println(Arrays.equals(d1,d2));
        System.out.println(Arrays.equals(d1,d3));
        //System.out.println(d2,i); different array type
        System.out.println(Arrays.equals(ob1,ob2));
        String[] s1=new String[]{"hello","hi"};
        String[] s2=new String[]{"hello","hi"};
        //System.out.println(s1,s2); can not use for string array
    }
}
