package Lesson8.task4;

import java.util.Arrays;
import java.util.Random;

public class Practice {

    public static void main(String[] args) {
        printOddsInReverseOrder();
        System.out.println();

        int[] randomArray = createRandomArrey();
        System.out.println(Arrays.toString(randomArray));
        System.out.println(calculateAmountEvens(randomArray));

    }
    public static int calculateAmountEvens(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result++;
            }
        }
        return result;
    }
    public static int[] createRandomArrey() {
        Random random = new Random();
        int[] result = new int[15];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(10);
        }
        return result;
    }
    public static void printOddsInReverseOrder() {


        int size = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                size++;
            }
        }
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = i * 2 + 1;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
