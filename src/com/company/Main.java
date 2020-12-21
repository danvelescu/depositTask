package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Deposit deposit = new Deposit();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product1"));
        productList.add(new Product("Product1"));
        productList.add(new Product("Product1"));
        productList.add(new Product("Product2"));
        productList.add(new Product("Product2"));
        productList.add(new Product("Product2"));
        productList.add(new Product("Product3"));
        productList.add(new Product("Product3"));
        productList.add(new Product("Product4"));
        productList.add(new Product("Product4"));
        productList.add(new Product("Product4"));
        productList.add(new Product("Product5"));

       deposit.countAllProducts(productList).forEach((product,count) -> System.out.println("Count: "+count+" Product name: "+product.getNameOfProduct()));
    }
}
