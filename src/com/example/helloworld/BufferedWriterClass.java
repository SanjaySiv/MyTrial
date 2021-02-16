package com.example.helloworld;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("java.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Welcome to java coding");
        bw.close();
        fw.close();
    }
}
