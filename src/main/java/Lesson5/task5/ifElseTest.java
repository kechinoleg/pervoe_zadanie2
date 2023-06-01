package Lesson5.task5;

public class ifElseTest {

    public static void main(String[] args) {

        System.out.println("начало работы.");

        int a = 10;
        int b = 15;

        if (a == b) {
            System.out.println("а равно b");

        } else {
            System.out.println("a не равно b.");

        }
        System.out.println();


        System.out.println("упражнение второе.");

        if (a > b) {
            System.out.println("a бальше чем b");
            if (a % 2 == 0) {
                System.out.println("и при этом оно четное");
            }
        }

        System.out.println("конец программы.");
    }
}
