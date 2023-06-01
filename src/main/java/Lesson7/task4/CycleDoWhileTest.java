package Lesson7.task4;

import java.util.Scanner;

public class CycleDoWhileTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = 0;

        do {
            System.out.println("Выберите режим игры");
            System.out.println("1. Друг против друга");
            System.out.println("2. Против компа");
            System.out.println("3. Два на два");
            System.out.println("4. Два против компа");

            option = scanner.nextInt();

        } while (option < 1 || option > 4);
    }
}
