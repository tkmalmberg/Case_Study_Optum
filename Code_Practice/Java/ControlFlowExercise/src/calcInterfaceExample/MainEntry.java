package calcInterfaceExample;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a basic formula:");
        String input = sc.nextLine();
        String[] sList = input.split(" ");

        Calc calc = new Calc();

        switch (sList[1]) {
            case "+":
                System.out.println(calc.add.compute(Integer.parseInt(sList[0]), Integer.parseInt(sList[2]), sList[1]));
                    break;
            case "-":
                System.out.println(calc.subtract.compute(Integer.parseInt(sList[0]), Integer.parseInt(sList[2]), sList[1]));
                    break;
            case "*":
                System.out.println(calc.multiply.compute(Float.parseFloat(sList[0]), Float.parseFloat(sList[2]), sList[1]));
                    break;
            case "/":
                System.out.println(calc.divide.compute(Float.parseFloat(sList[0]), Float.parseFloat(sList[2]), sList[1]));
                    break;
        }
    }
}
