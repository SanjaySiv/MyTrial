package com.example.helloworld;

import java.util.stream.Stream;

public class StreamIterate {
    public static void main(String[] args){
        Stream.iterate(1,element->element+1)//iterate infinite times
                .filter(element->element%2==0)//filters stream
                .limit(10)//set limit to iteration
                .forEach(System.out::println);//print stream elements
    }
}
