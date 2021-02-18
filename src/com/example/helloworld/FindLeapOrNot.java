package com.example.helloworld;

public class FindLeapOrNot {
    public void leapCheck(int input){
            if((input%4==0 && input%100!=0)||(input%400==0)){
                System.out.println(input+" is a leap year");
            }
            else{
                System.out.println(input+" is not a leap year");
            }
            System.out.println("Thanks for using");
    }
}
