package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReduceMethod {
    public static void main(String[] args){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", 35000f));
        productList.add(new Product(2, "Battery", 1000f));
        productList.add(new Product(4, "Headset", 1500f));
        productList.add(new Product(7, "TV", 55000f));
        productList.add(new Product(9, "Refrigerator", 45000f));
        productList.add(new Product(5, "Mixer grinder", 9000f));
        productList.add(new Product(3, "AC", 38000f));
        float totalPrice1=productList.stream()
                .map(product -> product.price)
                .reduce(0.0f,(sum,price)->sum+price);
        System.out.println(totalPrice1+" reduce() with lambda");
        float totalPrice2=productList.stream()
                .map(product -> product.price)
                .reduce(0.0f,Float::sum);
        System.out.println(totalPrice2+" reduce() with method reference");
        double totalPrice3= productList.stream().collect(Collectors.summingDouble(product->product.price));
        System.out.println(totalPrice3+" Collectors");
        double totalPrice4= productList.stream().mapToDouble(product -> product.price).sum();
        System.out.println(totalPrice4+" mapToDouble()");

    }
}
