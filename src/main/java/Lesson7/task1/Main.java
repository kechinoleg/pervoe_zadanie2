package Lesson7.task1;

public class Main {

    public static void main(String[] args) {

        String word = "Привет";

       // int i = 3;

        for (int i  = 3; i < 10; i ++) {
            System.out.println(word);
            System.out.println("Значение переменной: " + i);
        }
       // System.out.println("Значение переменной: " + i);

        System.out.println("Цикл прекратил работу");

        System.out.println("Задача номер 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i >= 0; i++) {
            System.out.println("Безконечній цикл");
        }



    }
}
