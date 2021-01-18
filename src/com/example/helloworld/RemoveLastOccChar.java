package com.example.helloworld;

public class RemoveLastOccChar {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello PITS Java Training");
        int pos = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i') {
                pos = i;
            }
        }
        if (pos > 0) {
            str.delete(pos, pos + 1);
            System.out.println(str);
        }
    }
}
