package com.example.helloworld;

import java.util.Arrays;

public class ArraysBinarySearch1 {
    public static void main(String[] args){
        byte[] byteArr={10,20,15,30,22,35};
        Arrays.sort(byteArr);
        byte searchVal=21;
        int result=Arrays.binarySearch(byteArr,searchVal);
        if(result>=0){
            System.out.println("Search value found at "+result);
        }
        else{
            System.out.println("Search result not found");
        }
    }
}
