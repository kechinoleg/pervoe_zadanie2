package Lesson9.search;

import Lesson9.search.sort.SortUtils;

import java.util.Arrays;

public class SearchTest {

    public static void main(String[] args) {

        int [] array = {3, 4, 5, 6, 34, 32, 73, 5, 5, 89, 90, 32, 63 };

        System.out.print("Результат линейного поиска: ");
        System.out.println(SearchUtils.linearSearch(array, 90));

        Arrays.sort(array);

        System.out.println("Отсортированый массив: ");
        System.out.println(Arrays.toString(array));

        System.out.print("Результат двоичного поиска: ");
        System.out.println(SearchUtils.binarySearch(array, 90));

        System.out.println("Результат поиска прыжками: ");
        System.out.println(SearchUtils.jumpSearch(array, 90));

        array = new int[]{3, 4, 5, 6, 34, 32, 73, 5, 5, 89, 90, 32, 63 };
        System.out.println("Исходный не отсортированый массив: ");
        System.out.println(Arrays.toString(array));

        SortUtils.bubbleSort (array);
        System.out.println("Сортировка пузырьком: ");
        System.out.println(Arrays.toString(array));

        array = new int[]{3, 4, 5, 6, 34, 32, 73, 5, 5, 89, 90, 32, 63 };
        System.out.println("Исходный не отсортированый массив: ");
        System.out.println(Arrays.toString(array));
        SortUtils.insertionSort(array);
        System.out.println("Сортировка вставками: ");
        System.out.println(Arrays.toString(array));

        array = new int[]{3, 4, 5, 6, 34, 32, 73, 5, 5, 89, 90, 32, 63 };
        System.out.println("Исходный не отсортированый массив: ");
        System.out.println(Arrays.toString(array));

        SortUtils.selectionSort(array);
        System.out.println("Сортировка выбором: ");
        System.out.println(Arrays.toString(array));



    }
}
