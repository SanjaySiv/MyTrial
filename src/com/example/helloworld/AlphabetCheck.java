package com.example.helloworld;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter an alphabet : ");
        char ch=ob.next().charAt(0);
        switch (ch){
            case 'a'|'A':
            case 'e'|'E':
            case 'i'|'I':
            case 'o'|'O':
            case 'u'|'U':System.out.println(ch+" is a vowel");
                break;
            default:System.out.println(ch+" is a consonant");
        }
    }
}