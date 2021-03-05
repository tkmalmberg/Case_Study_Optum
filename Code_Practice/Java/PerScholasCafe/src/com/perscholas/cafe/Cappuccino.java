package com.perscholas.cafe;

public class Cappuccino extends Product {
    private boolean peppermint, whippedCream;

    public Cappuccino() {
        super();
        this.peppermint = false;
        this.whippedCream = false;
    }

    public Cappuccino(String name, String description, double price, boolean peppermint, boolean whippedCream) {
        super(name, description, price);
        this.peppermint = peppermint;
        this.whippedCream = whippedCream;
    }

    public boolean isPeppermint() {
        return peppermint;
    }

    public void setPeppermint(boolean peppermint) {
        this.peppermint = peppermint;
    }

    public boolean isWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(boolean whippedCream) {
        this.whippedCream = whippedCream;
    }

    @Override
    public double calcSubTotal() {
        double sub = this.getPrice();
        if (this.whippedCream) {
            sub += 1.00;
        }
        if (this.peppermint) {
            sub += 2.00;
        }
        return sub;
    }
}
