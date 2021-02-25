package arrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + ", ");
        }

        System.out.println("\n------------------------------------------");
        int[] arr2 = {13, 5, 7, 68, 2};
        int middleInd = ((arr.length/2) + (arr.length%2));
        System.out.println(arr2[middleInd]);

        System.out.println("--------------------------------------------");
        String[] arr3 = {"red", "green", "blue", "yellow"};
        System.out.println(arr3.length);
        String[] arr3Clone = arr3.clone();
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr3Clone));

        System.out.println("--------------------------------------------");
        int[] arr4 = {1, 2, 3, 4, 5};
        System.out.println(arr4[0]);
        System.out.println(arr4[arr4.length - 1]);
        // VVV This will produce an error since the index parameter is out of bounds
        // System.out.println(arr4[arr4.length]);
        // Arrays are immutable

        System.out.println("--------------------------------------------");
        int[] arr5 = new int[5];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i;
        }
        System.out.println(Arrays.toString(arr5));

        System.out.println("--------------------------------------------");
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = i * 2;
        }
        System.out.println(Arrays.toString(arr5));

        System.out.println("--------------------------------------------");
        int midInd = ((arr5.length/2) + (arr5.length%2)) - 1;
        for (int i = 0; i < arr5.length; i++) {
            if (i == midInd) {
                continue;
            }
            System.out.println(arr5[i]);
        }

        System.out.println("--------------------------------------------");
        String[] arr6 = {"this", "is", "a", "String", "Array"};

    }

}
