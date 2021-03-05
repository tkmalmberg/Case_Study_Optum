package com.perscholas.cafe;

public abstract class Product {
    public final double SALES_TAX = 0.05;
    private String name, description;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSALES_TAX() {
        return SALES_TAX;
    }

    public abstract double calcSubTotal();

    public double calcTax() {
        double tax = calcSubTotal() * SALES_TAX;
        return tax;
    }

    public double calculateProductPriceTotal() {
        double totalPrice = this.calcSubTotal() + this.calcTax();
        return totalPrice;
    }
}
