package ControlFlow;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an Integer between 10 and 20");
        int x = input.nextInt();
        if (10 <= x && x <= 20) {
            System.out.println("Within Range");
        } else if (10 >= x || x >= 20){
            System.out.println("Out of Range");
        }

        System.out.print("Enter your Grade: ");
        int grade = input.nextInt();
        if (grade > 100 || grade < 0) {
            System.out.println("Score out of range");
        } else if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else if (grade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        int day = 0;
        while (day < 1 || day > 7) {
            System.out.print("Enter a number 1-7: ");
            day = input.nextInt();
        }

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}
