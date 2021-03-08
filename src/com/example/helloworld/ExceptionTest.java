package com.example.helloworld;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class ExceptionTest {
    public void run() throws IOException, ParseException {
        //throw new IOException("Device error");
        throw new ParseException("Error in cmd line",2);
    }
    public void input() throws IOException, FileNotFoundException{

    }
}
