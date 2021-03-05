package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);
        productList.add(new Coffee("Coffee", "Black Coffee", 2.00, false, false));
        productList.add(new Espresso("Espresso", "A shot of espresso", 2.50));
        productList.add(new Cappuccino("Cappuccino", "Espresso with milk and foam", 4.00));

        double subTotal = 0.0;
        double total = 0.0;
        double tax = 0.0;
        for (Product item : productList) {
            System.out.printf("How many orders of %s would you like?\n", item.getName());
            item.setQuantity(sc.nextInt());
            subTotal += item.calcSubTotal();
            tax += item.calcTax();
            total += item.calculateProductPriceTotal();
            System.out.printf("%d %s: %s -- $%.2f \n", item.getQuantity(), item.getName(),item.getDescription(), item.calcSubTotal());
        }


        System.out.printf("\nSubtotal:\t$%.2f\n", subTotal);
        System.out.printf("Sales Tax:\t$%.2f\n", tax);
        System.out.printf("Total:\t\t$%.2f\n", total);

    }
}
