package com.example.helloworld;

import java.util.Scanner;

public class PalindromeCheck {
    Scanner ob=new Scanner(System.in);
    void checking() {
        System.out.println("Enter word to check palindrome : ");
        String inputString=ob.nextLine();
        if(inputString.isBlank()){
            System.out.println("enter a valid word");
            checking();
        }
        else{
        StringBuilder inputSb = new StringBuilder(inputString);
        inputSb.reverse();
        String reversedString = inputSb.toString();
            if (reversedString.equalsIgnoreCase(inputString)) {
                System.out.println(inputString + " is a palindrome");
            }
            else {
                System.out.println(inputString + " is not a palindrome");
            }
            nextWord();
        }
    }
    void nextWord(){
        System.out.println("Do you want to try another word? y/n : ");
        String tryNext=ob.nextLine();
        if(tryNext.equals("y")){
            checking();
        }
        else if(tryNext.equals("n")){
            System.out.println("Thanks for using");
        }
        else{
            System.out.println("Please type a proper input");
            nextWord();
        }
    }
    public static void main(String[] args){
        PalindromeCheck obj=new PalindromeCheck();
        obj.checking();
    }
}
