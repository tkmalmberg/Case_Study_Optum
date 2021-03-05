package java_exercise;

import java.util.Arrays;

public class bundle1 {
    public static void main(String[] args) {
        int[] my_array1 ={1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
        String[] my_array2 ={"Java","Python","PHP","C#","C Programming","C++"};
        int[] my_array3 = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("#1 -------------------------");
        Arrays.sort(my_array1);
        System.out.println(Arrays.toString(my_array1));

        Arrays.sort(my_array2);
        System.out.println(Arrays.toString(my_array2));

        System.out.println("#2 -------------------------");

        System.out.println(sumArray(my_array3));

        System.out.println("#3 -------------------------");
        grid();

        System.out.println("#4 -------------------------");
        average();

        System.out.println("#5 -------------------------");
        contains();

        System.out.println("#6 -------------------------");
        contains();

        System.out.println("#7 -------------------------");
        remove();

        System.out.println("#8 -------------------------");
        copy();

        System.out.println("#9 -------------------------");
        insert(103, 5);

        System.out.println("\n#10 -------------------------");
        minMax();
        System.out.println("#9 -------------------------");

        reverse();
        System.out.println("\n-------------------------");
        dupes();
    }

    public static int sumArray(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    public static void grid() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public static void average() {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

        double avg = sumArray(numbers);
        avg = avg / numbers.length;
        System.out.println(avg);
    }

    public static void contains() {
        int[] my_array ={1789,2035,1899,1456,2013,1458,2458,1254,1472,2365,1456,2165,1457,2456};
        int value = 1254;
        int index = 0;
        boolean cont = false;

        for (int j = 0; j < my_array.length; j++) {
            if (value == my_array[j]) {
                cont = true;
                index = j;
                break;
            }
        }

        if (cont) {
            System.out.println("It sure does");
        } else {
            System.out.println("nope");
        }

        System.out.println(index);
//        while (value != my_array[i]) {
//            boolean contains = false;
//        }
    }

    public static void remove() {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int[] newArray = new int[numbers.length];
        int value = 25;

        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i]) {
                continue;
            }
            newArray[i] = numbers[i];
            System.out.print(newArray[i] + ", ");
        }
        System.out.println();
    }

    public static void copy() {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int[] newArray = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
            System.out.print(newArray[i] + ", ");
        }
        System.out.println();
    }

    public static void insert(int value, int index) {
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int[] newArray = new int[numbers.length];

        for (int i = 0; i <= numbers.length; i++) {
            if (i >= index) {
                if (i == index) {
                    newArray[i] = value;
                    System.out.print(newArray[i] + ", ");
                    break;
                }
                newArray[i] = numbers[i];
                System.out.print(newArray[i] + ", ");
                break;
            }
            newArray[i] = numbers[i];
        }
    }

    public static void minMax() {
        int[] my_array ={25,14,56,15,36,56,77,18,29,49};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < my_array.length; i++) {
            if (my_array[i] < min) {
                min = my_array[i];
            }
            if (my_array[i] > max) {
                max = my_array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void reverse() {
        int[] my_array ={25,14,56,15,36,56,77,18,29,49};
        int[] rev_array = new int[my_array.length];
        int ind = 0;

        for (int i = my_array.length-1; i >= 0; i-=1) {
            for (int j = 0; j < my_array.length; j++) {
                if (j == ind) {
                    rev_array[i] = my_array[j];
                    break;
                }
            }
            ind++;
        }
        for (int j : rev_array) {
            System.out.print(j + " ");
        }
    }

    public static void dupes() {
        int[] my_array ={1,2,5,5,6,6,7,2};
        int[] dup_arr = new int[my_array.length];

        for (int i = 0; i < my_array.length; i++) {
            for (int j = 0; j < my_array.length; j++) {
                if (my_array[i] == my_array[j] && i != j) {
                    dup_arr[i] = my_array[j];
                    break;
                }
            }
        }
        for (int j : dup_arr) {
            System.out.print(j + " ");
        }
    }

}
