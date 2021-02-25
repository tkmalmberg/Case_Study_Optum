package ControlFlow;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
//        GCD();
        Tuition();
    }

    public static void Tuition() {
        double tuition = 10000;
        double rate = 0.07;
        double scale = Math.pow(10, 2);
        int years = 0;

        while (tuition < 20000) {
            tuition = Math.round((tuition + (tuition*rate))*100)/100.0;
            years++;
        }

        System.out.printf("It took %d years for tuition to reach $%f", years, tuition);
    }
    public static void GCD() {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int gcd = 1;

        for (int i = 1; i > n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        System.out.printf("Your GCD is %d", gcd);
    }
}
