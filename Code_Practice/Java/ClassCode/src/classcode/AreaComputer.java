package classcode;

import java.util.Scanner;

public class AreaComputer {
    /** Main method */
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner input = new Scanner(System.in);

        // Assign a radius
        System.out.println("Please enter an integer:");
        radius = input.nextDouble();

        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);
    }
}
