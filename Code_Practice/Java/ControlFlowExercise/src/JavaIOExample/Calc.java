package JavaIOExample;

import java.util.Arrays;
import java.util.List;

public class Calc {
    private int sum;
    private int num1, num2;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public Calc performSum(List<Integer> nums) {
        for (Integer num :
                nums) {
            sum += num;
        }
        return this;
    }

    public void displaySum() {
        System.out.println(sum);
    }

    public Calc numberToPerformOn(int a, int b) {
        this.num1 = a;
        this.num2 = b;
        return this;
    }

    public void operation(String op) {
        switch (op) {
            case "+":
                System.out.println(this.num1 + this.num2);
                break;
            case "-":
                System.out.println(this.num1 - this.num2);
                break;
            case "*":
                System.out.println(this.num1 * this.num2);
                break;
            case "/":
                System.out.println(this.num1 / this.num2);
                break;
        }
    }
}
