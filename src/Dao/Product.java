package Dao;

import Model.ProductDetails;

import java.util.HashMap;
import java.util.Map;

public class Product {
    private static Map<Integer, ProductDetails> productDetailsMap = new HashMap<>();

    public void populateProducts() {
        productDetailsMap.put(1,new ProductDetails("The Alchemist",1L, "Novel", 300.00F));
        productDetailsMap.put(2,new ProductDetails("Sony TV",2L, "Smart TV 22\"", 8000.00F));
        productDetailsMap.put(3,new ProductDetails("One plus 8",3L, "Mobile Phone", 10000.00F));
    }

    public Map<Integer, ProductDetails> getProductDetailsMap() {
        return productDetailsMap;
    }
}
