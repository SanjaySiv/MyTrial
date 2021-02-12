package com.example.helloworld;

import java.io.IOException;
import java.text.ParseException;

public class ExceptionMultipleException3 {
    public static void main(String[] args){
        ExceptionTest ex=new ExceptionTest();
        try{
            ex.run();
        }catch (IOException | ParseException e){
            e.printStackTrace();
        }
    }
}
