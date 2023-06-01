package Lesson4.homework0805.home1.home4;

import java.util.Scanner;

public class home04 {
    public static void main(String[] args) {

        final int CALORIES_PER_SQUARE_CM = 40;
        final double PI = 3.14159;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диаметр первой пиццы (в см): ");
        double diameter1 = scanner.nextDouble();
        System.out.print("Введите диаметр второй пиццы (в см): ");
        double diameter2 = scanner.nextDouble();

        double area1 = PI * Math.pow(diameter1 / 2, 2);
        double area2 = PI * Math.pow(diameter2 / 2, 2);

        double difference = (area2 - area1) * CALORIES_PER_SQUARE_CM;

        System.out.printf("Если купишь пиццу диаметром %.1f см вместо пиццы диаметром %.1f см, то получишь в нагрузку %.0f калорий.\n",
                diameter2, diameter1, difference);

    }
}
