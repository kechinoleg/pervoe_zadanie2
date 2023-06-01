package Lesson6;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирете язык");

        String input = scanner.nextLine().toLowerCase();
        switch (input) {
            case "ru":
                System.out.println("Русский язык");
                break;
            case "en":
                System.out.println("Английский");
                break;
            case "ge":
                System.out.println("Немецкий");
                break;
            default:
                System.out.println("Испанский");
                break;
        }
    }
}
