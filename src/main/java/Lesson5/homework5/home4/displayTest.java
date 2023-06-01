package Lesson5.homework5.home4;

import java.util.Random;

public class displayTest {

    public static void main(String[] args) {

        Random random = new Random();
        int n = random.nextInt(2801);

        System.out.println("Осталось секунд: " + n);
        printRemainingHours(n);
    }

    public static void printRemainingHours(int seconds) {
        int hours = seconds / 3600;
        if (hours >= 1) {
            System.out.println("Осталось " + hours + " час" + (hours > 1 ? "а" : "") + ".");
        } else {
            System.out.println("Осталось менее часа.");
        }
    }
}
