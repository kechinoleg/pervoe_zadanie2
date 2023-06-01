package Lesson8.task3;

import java.util.Arrays;

public class ArrayMethodsTest {

    public static void main(String[] args) {

        int[] sourse = {7, 5, 3, 8, 4, 6, 2, 1, 1};

        int[] target = sourse.clone();

        System.out.println(Arrays.toString(target));

        int[] array = Arrays.copyOf(sourse,5);

        System.out.println(Arrays.toString(array));

        int[] array1 = Arrays.copyOfRange(sourse, 2, 6);

        System.out.println(Arrays.toString(array1));

        Arrays.sort(sourse);
        System.out.println(Arrays.toString(sourse));
    }


}
