package method_practice;

public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double d) {
        super(d, d);
    }

    public void setWidth(double w) {
        super.setWidth(w);
        super.setHeight(w);
    }
}
