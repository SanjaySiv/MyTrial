package com.example.helloworld;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("java.txt");
        fw.write("Welcome to java");
        fw.close();
    }
}
