package com.example.helloworld;

import java.io.*;

public class TryWithResources {
    public static void main(String [] args){
        File file=new File("Java.txt");
        try (BufferedReader br=new BufferedReader(new FileReader(file))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("can't find file "+file.toString());
        } catch (IOException e) {
            System.out.println("unable to read file "+file.toString());
        }
    }
}
