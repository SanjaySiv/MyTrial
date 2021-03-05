package com.example.helloworld;

import java.util.Arrays;

public class ParallelArraySorting {
    public static void main(String [] args){
        int[] array={4,8,1,0,6,3,7,2,-1,9};
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.parallelSort(array);
        System.out.print("Sorted array : ");
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        double[] doubleArray={9.56,5.56,5.43,2.56,9.45,1.34,4.52};
        Arrays.parallelSort(doubleArray,0,5);
        System.out.print("Sorted array from 0 to 4th index : ");
        for(double d:doubleArray){
            System.out.print(d+" ");
        }
    }
}
