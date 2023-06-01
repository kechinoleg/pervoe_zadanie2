package Lesson7.task2;

public class CycleTest {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма: " + sum);

        sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
