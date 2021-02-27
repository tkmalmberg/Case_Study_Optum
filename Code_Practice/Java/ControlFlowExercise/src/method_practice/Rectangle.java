package method_practice;

public class Rectangle {
    private double width, height;

    public Rectangle(double w, double h) {
        this.height = h;
        this.width = w;
    }
    public Rectangle() { this(100, 100); }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public void setWidth(double width) { this.width = width; }
    public void setHeight(double height) { this.height = height; }

}
