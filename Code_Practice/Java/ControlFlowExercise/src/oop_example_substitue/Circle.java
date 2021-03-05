package oop_example_substitue;

public class Circle {
    // private instance variable
    private double radius;
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    // Getter
    public double getRadius() {
        return this.radius;
    }
    // Return the area of this circle
    public double getArea() {
        return radius * radius * Math.PI;
    }
    // Describe itself
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}
