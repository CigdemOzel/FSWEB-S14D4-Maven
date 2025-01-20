package org.example.model;

public class Chocolate extends ProductForSale {
    private String cocoaPercentage;

    public Chocolate(String type, int price, String description) {
        super(type, price, description);
        this.cocoaPercentage = "70%";
    }

    public Chocolate(String type, int price, String description, String cocoaPercentage) {
        super(type, price, description);
        this.cocoaPercentage = cocoaPercentage;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Percentage: " + cocoaPercentage);
    }
}