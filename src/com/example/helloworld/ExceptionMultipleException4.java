package com.example.helloworld;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionMultipleException4 {
    public static void main(String[] args){
        ExceptionTest et=new ExceptionTest();

        try {
            et.input();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
