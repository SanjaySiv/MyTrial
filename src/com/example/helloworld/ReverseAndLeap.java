package com.example.helloworld;

import java.util.Scanner;

public class ReverseAndLeap {
    FindLeapOrNot leap=new FindLeapOrNot();
    Scanner input=new Scanner(System.in);
    Scanner stringInput=new Scanner(System.in);
    public void reverseCheck(int number){
        int reverseNum;
        System.out.print("Reversed num is ");
        while(number>0){
            reverseNum=number%10;
            System.out.print(reverseNum);
            number=number/10;
        }
        System.out.println();
    }
    public void takeInput(){
        System.out.println("Enter a number to print its reverse : ");
        int inputNum=input.nextInt();
        reverseCheck(inputNum);
        checkLeapOrNot(inputNum);
    }
    public void checkLeapOrNot(int inputNum) {
        System.out.println("Do you want to check whether the num leap year or not(yes/no) : ");
        String yesOrNo = stringInput.nextLine();
        if (yesOrNo.equals("yes")) {
            leap.leapCheck(inputNum);
            tryNextNum();
        } else if (yesOrNo.equals("no")) {
            System.out.println("Thanks for using");
            tryNextNum();
        } else {
            System.out.println("Invalid input, try again");
            checkLeapOrNot(inputNum);
        }
    }
    public void tryNextNum(){
        System.out.println("Do you want to try another number?(yes/no) : ");
        String yesOrNo = stringInput.nextLine();
        if (yesOrNo.equals("yes")) {
            takeInput();
        } else if (yesOrNo.equals("no")) {
            System.out.println("Thanks for using");
        } else {
            System.out.println("Invalid input, try again");
            tryNextNum();
        }
    }
    public static void main (String[]args){
            ReverseAndLeap rev = new ReverseAndLeap();
            rev.takeInput();
    }
}
