package com.perscholas.cafe;

public class Coffee extends Product {
    private boolean sugar, milk;

    public Coffee() {
        super();
        this.milk = false;
        this.sugar = false;
    }

    public Coffee(String name, String description, double price, boolean sugar, boolean milk) {
        super(name, description, price);
        this.sugar = sugar;
        this.milk = milk;
    }

    public boolean isSugar() {
        return sugar;
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    @Override
    public double calcSubTotal() {
        return this.getPrice();
    }
}
