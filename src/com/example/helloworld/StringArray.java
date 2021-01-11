package com.example.helloworld;

public class StringArray {
    public static void main(String[] args){
        String[] word=new String[3];
        word[0]="Hello";
        word[1]="to";
        word[2]="you";

        for (int i=0;i<word.length;i++){
            System.out.print(word[i]+" ");
        }
        System.out.println();
        String[] fruits={"apple","banana","kiwi","orange"};
        for(String fruit:fruits){                   //for each
            System.out.println(fruit);
        }
    }
}
