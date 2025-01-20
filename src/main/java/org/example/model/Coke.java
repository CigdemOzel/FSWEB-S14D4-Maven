package org.example.model;

public class Coke extends ProductForSale {
    private boolean isDiet;

    public Coke(String type, int price, String description) {
        super(type, price, description);
        this.isDiet = false;
    }

    public Coke(String type, int price, String description, boolean isDiet) {
        super(type, price, description);
        this.isDiet = isDiet;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Details:");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Is Diet: " + (isDiet ? "Yes" : "No"));
    }
}