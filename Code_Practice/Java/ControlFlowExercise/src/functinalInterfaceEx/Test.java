package functinalInterfaceEx;

public class Test implements InterfaceExample{
    @Override
    public void compare(String a, String b) {
        if (a.length() > b.length()) {
            System.out.println(a + " is longer than " + b);
        } else if (b.length() > a.length()){
            System.out.println(b + " is longer than " + a);
        } else {
            System.out.println("These are the same length");
        }
    }
}
