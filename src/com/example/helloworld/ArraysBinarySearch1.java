package com.example.helloworld;

import java.util.Arrays;

public class ArraysBinarySearch1 {
    public static void main(String[] args){
        byte[] byteArr={10,20,15,30,22,35};
        Arrays.sort(byteArr);
        byte searchByte=22;
        int byteResult=Arrays.binarySearch(byteArr,searchByte);
        if(byteResult>=0){
            System.out.println("Search value found at "+byteResult);
        }
        else{
            System.out.println("Search result not found");
        }
        char[] charArr={'z','b','y','e','d'};
        Arrays.sort(charArr);
        char searchChar='y';
        int charResult=Arrays.binarySearch(charArr,searchChar);
        if(charResult>=0){
            System.out.println("Search value found at "+charResult);
        }
        else{
            System.out.println("Search result not found");
        }
    }
}
