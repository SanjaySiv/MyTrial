package com.example.helloworld;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args){
        Scanner ob= new Scanner(System.in);

        System.out.println("Enter a command ");
        String command=ob.nextLine();

        switch(command){
            case "start":
                System.out.println("machine started");
                break;
                
            case "stop":
                System.out.println("machine stopped");
                break;

            default:
                System.out.println("Command not recognized");

        }
    }
}
