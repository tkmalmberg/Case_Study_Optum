package method_practice;

public class ClassPrac {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(200, 300), defRec = new Rectangle();
        Square s1 = new Square(300);

        System.out.println("rec");
        System.out.println(rec.getHeight());
        System.out.println(rec.getWidth());
        System.out.println("defRec");
        System.out.println(defRec.getHeight());
        System.out.println(defRec.getWidth());
        System.out.println("s1");
        System.out.println(s1.getHeight());
        System.out.println(s1.getWidth());
    }
}
