package com.example.helloworld;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderClassDataFromConsole {
    public static void main(String[] args)throws Exception{
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        String name="";
        while(!name.equals("stop")) {
            System.out.println("Enter your name : ");
            name = br.readLine();
            System.out.println("Welcome " + name);
        }
        br.close();
        ir.close();
    }
}

