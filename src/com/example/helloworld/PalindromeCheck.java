package com.example.helloworld;

import java.util.Scanner;

public class PalindromeCheck {
    void checking() {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter word to check palindrome : ");
        String inputString=ob.nextLine();
        if(inputString.isBlank()){
            System.out.println("enter a valid word");
            checking();
        }
        else{
            inputString = inputString.toLowerCase();
        StringBuilder inputSb = new StringBuilder(inputString);
        inputSb.reverse();
        String reversedString = inputSb.toString();
            if (reversedString.equals(inputString)) {
                System.out.println(inputString + " is a palindrome");
            } else {
                System.out.println(inputString + " is not a palindrome");
            }
        }
        System.out.println("Do you want to try another word? y/n : ");
        String tryNext=ob.nextLine();
        if(tryNext.equals("y")){
            checking();
        }
        else{
            System.out.println("Thanks for using");
        }
    }
    public static void main(String[] args){

        PalindromeCheck obj=new PalindromeCheck();
        obj.checking();

    }
}
