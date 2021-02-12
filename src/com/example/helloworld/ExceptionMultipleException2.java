package com.example.helloworld;

import java.io.IOException;
import java.text.ParseException;

public class ExceptionMultipleException2 {
    public static void main(String[] args){
        ExceptionTest  e=new ExceptionTest();
        try {
            e.run();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ParseException parseException) {
            System.out.println("Could not load file");
        }
    }
}
