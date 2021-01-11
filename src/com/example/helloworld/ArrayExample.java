package com.example.helloworld;

public class ArrayExample {
    public static void main(String [] args) {
        int[] values;
        values = new int[3];
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
