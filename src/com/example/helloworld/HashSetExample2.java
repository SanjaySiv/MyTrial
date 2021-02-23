package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String [] args){
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("f");
        arrayList.add("a");
        arrayList.add("v");
        arrayList.add("j");
        System.out.println("ArrayList : "+arrayList);
        HashSet<String>hashSet=new HashSet<>(arrayList);
        System.out.println("HashSet : "+hashSet);
        String [] array=new String[]{"q","r","s","z"};
        hashSet.addAll(Arrays.asList(array));
        System.out.println("After adding elements of array : "+hashSet);
        System.out.print("Converting HashCode to array : ");
        Object[] obj=hashSet.toArray();
        for(Object i:obj){
            System.out.print(i+" ");
        }
    }
}
