package arrays;

public class Loops {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------");
        for (int i = 0; i <= 100; i+=10) {
            System.out.println(i);
        }

        System.out.println("------------------------------------------");
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j <= 10);

        System.out.println("------------------------------------------");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i >= 25 && i <= 75) {
                    continue;
                }
                System.out.println(i);
            }
        }

        System.out.println("------------------------------------------");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                if (i > 50) {
                    break;
                }
                System.out.println(i);
            }
        }
        
        System.out.println("------------------------------------------");
        for (int i = 1; i <= 2; i++) {
            System.out.printf("Week %d:\n", i);
            for (int k = 1; k <= 7; k++) {
                System.out.printf("\tDay %d\n", k);
            }
        }

        System.out.println("------------------------------------------");
        for (int i = 10; i <= 200; i++) {
            String num = String.valueOf(i);
            if (num.charAt(0) == num.charAt(num.length() - 1)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        System.out.println("------------------------------------------");
        int fib = 0;
        int fibLast = 0;
        int temp;
        while (fib <= 50) {
            if (fib == 0) {
                System.out.println(fib);
                fib++;
            } else {
                System.out.println(fib);
                temp = fib;
                fib = fib + fibLast;
                fibLast = temp;
            }
        }

        System.out.println("------------------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < 10; k++) {
                System.out.printf("Inner Loop: i:%d k:%d\n", i, k);
            }
        }
    }
}
