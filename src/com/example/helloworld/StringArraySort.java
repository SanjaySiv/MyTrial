package com.example.helloworld;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringArraySort {
    public void sorting(){
        Scanner num=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        System.out.println("Enter size of string array : ");
        int arraySize=num.nextInt();
        String[] stringArray=new String[arraySize];
        System.out.println("Enter elements of string array : ");
        for(int i=0;i<arraySize;i++){
            System.out.print(i+1 +".");
            stringArray[i]=str.nextLine();
            if(stringArray[i].isBlank()){
                System.out.println("It's blank retype a valid word");
                i-=1;
            }
        }

        /*for(int j=0;j<arraySize;j++){
            for(int k=j+1;k<arraySize;k++){
                if(stringArray[j].compareTo(stringArray[k])>0){
                    String temp=stringArray[j];
                    stringArray[j]=stringArray[k];
                    stringArray[k]=temp;
                }
            }
        }*/
        Arrays.sort(stringArray);
        //Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.print("Sorted String array : ");
        for(String sortedArray:stringArray){
            System.out.print(sortedArray+", ");
        }
        System.out.println();
        nextArray();
    }
    public void nextArray(){
        Scanner next=new Scanner(System.in);
        System.out.println("Do you want to try another array? (yes/no)");
        String yesOrNo=next.nextLine();
        if(yesOrNo.equalsIgnoreCase("yes")){
            sorting();
        }
        else if(yesOrNo.equalsIgnoreCase("no")){
            System.out.println("Thanks for using");
        }
        else{
            System.out.println("Please type a proper input ");
            nextArray();
        }
    }
    public static void main(String[] args){
        StringArraySort ob=new StringArraySort();
        ob.sorting();
    }
}
