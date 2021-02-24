package opandnums;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        int randomTemp = 0;
        while (randomTemp<10) {
            randomTemp = (int)(Math.random()*100);
        }
        String random = String.valueOf(randomTemp);
//        System.out.println(random);
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter two digits for the lottery: ");
        String input = scan.nextLine();

        if (input.equals(random)) {
            System.out.println("You win $5000");
        } else if (input.charAt(0)== random.charAt(1) && input.charAt(1)== random.charAt(0)) {
            System.out.println("You win $1000");
        } else if (input.charAt(0)== random.charAt(0) || input.charAt(1)== random.charAt(1)
                || input.charAt(0)== random.charAt(1) || input.charAt(1)== random.charAt(0)) {
            System.out.println("You win $250");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}

