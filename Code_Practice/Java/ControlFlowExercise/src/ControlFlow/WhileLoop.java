package ControlFlow;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Adding();
        WhileGame();
    }

    public static void WhileGame() {
        int count = 0;
        String playAgain = new String("y");

        Scanner scanner = new Scanner(System.in);

         do {
            int num = (int)(Math.random()*100+1);
            System.out.println("Guess the number I'm thinking of!");
            int input = scanner.nextInt();
            while (input != num) {
                if (input > num) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Too low");
                }
                input = scanner.nextInt();
                count++;
            }
            System.out.printf("You got it! It took you %d tries.", count);
            System.out.print("Want to Play again? Press y. If not, press anything else.");
            playAgain = scanner.next();
        } while (playAgain.equals("y"));
    }

    public static void SubtractGame() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int n1 = (int)(Math.random()*100+1);
            int n2 = (int)(Math.random()*100+1);

            System.out.printf("What is %d - %d?", n1, n2);
            int input = scanner.nextInt();

        }
    }

    public static void Adding() {
        Scanner scanner = new Scanner(System.in);
        int n1 = (int)(Math.random()*100+1);
        int n2 = (int)(Math.random()*100+1);

        System.out.printf("What is %d + %d?", n1, n2);
        int input = scanner.nextInt();
        System.out.println(n1+n2 == input);

        while (n1+n2 != input) {
            System.out.println("Try again...");
            System.out.printf("What is %d + %d?", n1, n2);
            input = scanner.nextInt();
        }
        System.out.println("Good job!");
    }
}
