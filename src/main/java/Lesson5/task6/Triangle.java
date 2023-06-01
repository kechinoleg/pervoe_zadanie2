package Lesson5.task6;

public class Triangle {

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c =3;

        if (a != b && b != c && a !=c) {
            System.out.println("разносторониий");
        } else if (a == b && a == c) {
            System.out.println("равносторонний");
        } else {
            System.out.println("равнобедренный");
        }
    }


}
