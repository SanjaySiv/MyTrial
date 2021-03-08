package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamListToMapAndSet {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", 35000f));
        productList.add(new Product(2, "Battery", 1000f));
        productList.add(new Product(4, "Headset", 1500f));
        productList.add(new Product(7, "TV", 55000f));
        productList.add(new Product(9, "Refrigerator", 45000f));
        productList.add(new Product(5, "Mixer grinder", 9000f));
        productList.add(new Product(3, "AC", 38000f));
        Set<String>productNamesSet=productList.stream().map(product -> product.name).collect(Collectors.toSet());
        System.out.println(productNamesSet);
        Map<Integer,String>productsMap=productList.stream().filter(product -> product.price>30000)
                .collect(Collectors.toMap(product -> product.id,product -> product.name));
        System.out.println(productsMap);
    }
}
