package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class StreamMinMax {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", 35000f));
        productList.add(new Product(2, "Battery", 1000f));
        productList.add(new Product(4, "Headset", 1500f));
        productList.add(new Product(7, "TV", 55000f));
        productList.add(new Product(9, "Refrigerator", 45000f));
        productList.add(new Product(5, "Mixer grinder", 9000f));
        productList.add(new Product(3, "AC", 38000f));
        Product productMax=productList.stream().max((product1,product2)->product1.price>product2.price?1:-1).get();
        System.out.println(productMax.price);
        Product productMin=productList.stream().min((product1,product2)->product1.price>product2.price?1:-1).get();
        System.out.println(productMin.price);
        long count=productList.stream().filter(product -> product.price<30000).count();
        System.out.println("Product price less than 30000 count is "+count);
    }
}
