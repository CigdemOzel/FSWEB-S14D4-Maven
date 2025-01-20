package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = {
                new Bread("Bread", 10, "Freshly baked bread"),
                new Chocolate("Chocolate", 20, "Dark chocolate", "85%"),
                new Coke("Coke", 15, "Cold beverage", true)
        };

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("----------------------------");
        }
    }
}