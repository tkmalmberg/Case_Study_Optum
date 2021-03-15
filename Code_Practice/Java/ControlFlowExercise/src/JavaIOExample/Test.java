package JavaIOExample;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        File f = new File("D:\\Documents\\DnD");
//        String [] fileArray = f.list();
//
//        for (String file :
//                fileArray) {
//            if (file.contains("Waterdeep")) {
//                System.out.println(file);
//            }
//        }

        List<Integer> num = Arrays.asList(7, 4, 3);
        Calc calc = new Calc();

        calc.performSum(num).displaySum();

        calc.numberToPerformOn(10, 5).operation("+");
        calc.numberToPerformOn(10, 5).operation("-");
        calc.numberToPerformOn(10, 5).operation("*");
        calc.numberToPerformOn(10, 5).operation("/");

    }
}
