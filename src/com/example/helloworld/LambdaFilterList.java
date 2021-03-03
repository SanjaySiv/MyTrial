package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaFilterList {
    public static void main(String[] args){
        List<Product> list=new ArrayList<>();
        list.add(new Product(1,"Laptop",35000f));
        list.add(new Product(3,"Mobile",25000f));
        list.add(new Product(2,"Battery",1000f));
        list.add(new Product(4,"Headset",1500f));
        list.add(new Product(7,"TV",55000f));
        list.add(new Product(9,"Charger",2000f));
        System.out.println("Show products that costs more than 20000");
        Stream<Product>filtered=list.stream().filter(p->p.price>20000);
        filtered.forEach(
                product -> System.out.println(product.name+":"+product.price)
        );
    }
}
