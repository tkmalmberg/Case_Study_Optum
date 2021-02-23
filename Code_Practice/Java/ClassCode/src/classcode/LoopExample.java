package classcode;


public class LoopExample {
    public static void main(String[] args) {
        WhileLoopExample();
        // TODO Something has to happen here
    }

    private static void WhileLoopExample() {
        int count = 5;
        while (count >= 0) {
            System.out.println("Countdown: " + count);
            count--;
        }
    }
}
