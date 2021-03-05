package com.example.helloworld;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){
        String[] str=new String[10];
        Optional<String>checkNull=Optional.ofNullable(str[5]);
        if(checkNull.isPresent()){
            System.out.println("Present");
        }
        else{
            System.out.println("Not present");
        }
        Optional<String>empty=Optional.empty();
        System.out.println(empty);
        str[5]="Values present";
        Optional<String>value=Optional.of(str[5]);
        System.out.println("Filtered value "+value.filter(s -> s.equals("ABC")));
        System.out.println("Filtered value "+value.filter(s -> s.equals("Values present")));
        System.out.println("get() "+value.get());
        System.out.print("Method reference ");
        value.ifPresent(System.out::println);
        System.out.println("hashCode "+value.hashCode());
        System.out.println("ifPresent "+value.isPresent());
        System.out.println("orElse "+value.orElse("value is not present"));
        System.out.println("orElse "+empty.orElse("value is not present"));
        System.out.println("ofNullable "+Optional.ofNullable(str[5]));
    }
}
