package com.example.helloworld;

import java.util.Scanner;

public class ArraySortNum {
    public void sorting(){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size=ob.nextInt();
        int[] numArray=new int[size];
        System.out.println("Enter elements of array : ");
        for(int i=0;i<size;i++){
            numArray[i]=ob.nextInt();
        }
        for(int j=0;j<size;j++){
            for(int k=j+1;k<size;k++){
                int temp;
                if(numArray[j]>numArray[k]){
                    temp=numArray[j];
                    numArray[j]=numArray[k];
                    numArray[k]=temp;
                }
            }
        }
        System.out.println("Sorted array : ");
        for(int sortedArray:numArray){
            System.out.print(sortedArray+" ");
        }
    }
    public static void main(String[] args){
        ArraySortNum arr=new ArraySortNum();
        arr.sorting();
    }
}
