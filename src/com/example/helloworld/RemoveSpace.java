package com.example.helloworld;


public class RemoveSpace {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello PITS Java Training");
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.delete(i, i + 1);
            }
        }
        System.out.println(sb);
    }
}
