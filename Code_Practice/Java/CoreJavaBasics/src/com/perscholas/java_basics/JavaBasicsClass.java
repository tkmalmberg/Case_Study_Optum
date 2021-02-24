package com.perscholas.java_basics;

public class JavaBasicsClass {
    public static void main(String[] args) {
        System.out.print("Add two integers: ");
        AddTwoIntegers();
        System.out.print("Add two doubles: ");
        AddTwoDoubles();
        System.out.print("Add an integer and a double: ");
        AddIntAndDoub();
        System.out.print("Divide two integers: ");
        DivideInt();
        System.out.print("Divide two Doubles: ");
        DivTwoDoubles();
        System.out.print("Casting integers: ");
        CastingIntegers();
        System.out.print("Constants: ");
        Constants();
        System.out.println("Coffee Shop: ");
        CoffeeShop();
    }

    public static void AddTwoIntegers() {
        int a = 4;
        int b = 7;

        int sum = a + b;
        System.out.println(sum);
    }
    public static void AddTwoDoubles() {
        double a = 5.73;
        double b = 10.45;

        double sum = a + b;
        System.out.println(sum);
    }
    public static void AddIntAndDoub() {
        int a = 14;
        double b = 17.09;

        // The sum must be a double data type
        double sum = a + b;
        System.out.println(sum);
    }
    public static void DivideInt() {
        // int a = 14;
        double a = 14.00;
        int b = 7;

        // If you are dividing a double by an int, the result will be a double
        // just like when adding.
        double quotient = a / b;
        System.out.println(quotient);
    }
    public static void DivTwoDoubles() {
        double a = 5.73;
        double b = 10.45;

        double quo = a + b;
        System.out.println(quo);

        // Casting to a smaller Data Type will scrape of all of the
        // data held in the decimal place, but keep the decimal there
        // ex: double -> 16.18
        //     int    -> 16.0
        quo = (int)quo;
        System.out.println("Cast as int: " + quo);
    }
    public static void CastingIntegers() {
        int x = 5;
        int y = 6;

        int q = y/x;
        System.out.println(q);
        // If you want to cast y to double, you must
        // make q a double as well

        //
//        double t = y;
//        q = t/x;
//        System.out.println();

    }
    public static void Constants() {
        final int a = 5;

        int b = a + 6;
        System.out.println(b);

        // This does not work since var a cannot be changed
        // int c = a++;
    }
    public static void CoffeeShop() {
        final double SALES_TAX = 0.0875;
        double coffee = 2.50;
        double tea = 2.00;
        double cappuccino = 3.50;

        double subtotal, totalSale, tax;

        subtotal = (coffee * 3) + (tea * 4) + (cappuccino * 2);
        tax = Math.round(subtotal * SALES_TAX * 100) / 100.0;
        totalSale = subtotal + tax;

        System.out.println("Order Total: $" + totalSale);

    }

}
