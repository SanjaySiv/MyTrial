package com.example.helloworld;

import java.util.Scanner;

public class ArrayOfCarCompanies {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        System.out.println("Enter the number of companies :");  //array size
        int size = num.nextInt();

        String[] carCmp = new String[size];
        System.out.println("Enter the name of companies :");    //array elements
        for (int i = 0; i < carCmp.length; i++) {
            carCmp[i] = str.nextLine();
        }

        for (int i = 0; i < carCmp.length; i++) {
            if (carCmp[i].equalsIgnoreCase("bmw")) {  //searching for bmw
                System.out.println("bmw found");
                String temp = carCmp[i];
                System.arraycopy(carCmp, 0, carCmp, 1, i);
                carCmp[0] = temp;
                System.out.println("Altered order");
                for (String cars : carCmp) {
                    System.out.println(cars);
                }
                break;
            }
            else if(i== carCmp.length-1){
                System.out.println("bmw not found");
            }
        }
    }
}
