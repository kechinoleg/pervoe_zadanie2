package Lesson4.homework0805.home1.home2;

import java.util.Scanner;

public class home02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        double sum = add(a, b);
        double difference = subtract(a, b);
        double product = multiply(a, b);
        double quotient = divide(a, b);

        System.out.println("Сложение: " + sum);
        System.out.println("Вычетание: " + difference);
        System.out.println("Умножение: " + product);
        System.out.println("Деление: " + quotient);

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}




