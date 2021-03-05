package com.perscholas.cafe;

public class Espresso extends Product{
    boolean extraShot, macchiato;

    public Espresso() {
        super();
        this.extraShot = false;
        this.macchiato = false;
    }

    public Espresso(String name, String description, double price, boolean extraShot, boolean macchiato) {
        super(name, description, price);
        this.extraShot = extraShot;
        this.macchiato = macchiato;
    }

    @Override
    public double calcSubTotal() {
        double sub = this.getPrice();
        if (this.macchiato) {
            sub += 1.00;
        }
        if (this.extraShot) {
            sub += 2.00;
        }
        return sub;
    }
}
