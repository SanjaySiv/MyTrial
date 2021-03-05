package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsAvgCount {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", 35000f));
        productList.add(new Product(2, "Battery", 1000f));
        productList.add(new Product(4, "Headset", 1500f));
        productList.add(new Product(7, "TV", 55000f));
        productList.add(new Product(9, "Refrigerator", 45000f));
        productList.add(new Product(5, "Mixer grinder", 9000f));
        productList.add(new Product(3, "AC", 38000f));
        long count=productList.stream().collect(Collectors.counting());
        double average=productList.stream().collect(Collectors.averagingDouble(p->p.price));
        System.out.println("Number of elements "+count);
        System.out.println("Average of price "+average);
    }
}
