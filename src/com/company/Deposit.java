package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deposit {
    public Map<Product, Integer> countAllProducts(List<Product> products) {
        int count = 0;
        Map<Product, Integer> mapOfProducts = new HashMap<>();

        for (Product product : products) {
            count = 0;
            for (Product product1 : products) {
                if (product.equals(product1)) {
                    count++;
                }
            }

            mapOfProducts.put(product, count);
        }
        return mapOfProducts;
    }
}
