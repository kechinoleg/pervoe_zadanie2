package Lesson6;

public class SwitchTest {

    public static void main(String[] args) {

        int i = 6;

        switch (i) {
            case  1:
                System.out.println("i равно 1");
                break;
            case  2:
                System.out.println("i равно 2");
                break;
            case  5:
                System.out.println("i равно 5");
                break;
            default:
                System.out.println("i не равно не чему");
                break;
        }

        System.out.println("Конец программы");


    }
}
