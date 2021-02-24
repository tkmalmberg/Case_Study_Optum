package opandnums;

public class Main {
    public static void main(String[] args) {
        ConvertToBin();
    }

    public static void ConvertToBin() {
        int num = 8;
        String bin = "";

        while (num > 0) {
            int quo = num / 2;
            int rem = num % 2;
            bin = bin.concat(String.valueOf(rem));
            num = quo;
        }
        System.out.println(bin);
    }
}
