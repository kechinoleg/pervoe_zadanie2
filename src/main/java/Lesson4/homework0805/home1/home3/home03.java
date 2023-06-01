package Lesson4.homework0805.home1.home3;

import java.util.Scanner;

public class home03 {

    public static void main(String[] args) {

        final double EURO_TO_DOLLAR_RATE = 1.12;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в евро: ");
        double euroAmount = scanner.nextDouble();

        double dollarAmount = euroAmount * EURO_TO_DOLLAR_RATE;

        System.out.printf("%.2f евро это %.2f долларов\n", euroAmount, dollarAmount);
    }
}
