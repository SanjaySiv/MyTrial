package com.example.helloworld;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a year : ");
        int yr=ob.nextInt();
        if ((yr%4==0 && yr%100!=0)||(yr%400==0)) {
            System.out.println(yr+" is leap year");
        }
        else{
            System.out.println(yr+" is not a leap year");
        }
    }
}
