package com.example.helloworld;

import java.io.*;

public class FileReaderReadingFile {
    public static void main(String[] args) {
        File file = new File("java.txt");
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }
        finally {
            try {
                assert br != null;
                br.close();
            } catch (IOException e) {
                System.out.println("Unable to close the file "+file.toString());
            } catch (NullPointerException ex){
                //file was probably never opened
            }
        }
    }
}
