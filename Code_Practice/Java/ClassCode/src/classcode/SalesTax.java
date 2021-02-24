package classcode;

public class SalesTax {
    public static void main(String[] args) {
        double sale = 100.00;
        double rate = 0.0875;

        double tax = Math.round(sale * rate * 100) / 100.0;

        System.out.println(tax);

    }
}
