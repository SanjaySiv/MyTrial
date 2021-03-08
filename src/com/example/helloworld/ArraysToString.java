package com.example.helloworld;

import java.util.Arrays;

public class ArraysToString {
    public static void main(String[] args) {
        long[] l = new long[]{1235, 4567, 2357, 8656, 35783, 3567};
        System.out.println(Arrays.toString(l));
        Object[] o=new Object[]{12,34,56,"hi",l};
        System.out.println(Arrays.toString(o));
    }
}
