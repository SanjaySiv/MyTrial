package com.example.helloworld;

import java.io.IOException;
import java.text.ParseException;

public class ExceptionMultipleExceptions {
    public static void main(String[] args) throws IOException, ParseException {
        ExceptionTest e=new ExceptionTest();
        e.run();
    }
}
