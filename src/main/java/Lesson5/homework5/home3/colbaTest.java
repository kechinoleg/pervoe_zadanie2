package Lesson5.homework5.home3;

public class colbaTest {
    public static void main(String[] args) {

        int temperature1 = 110;
        int temperature2 = 99;

        checkDevice(temperature1, temperature2);
    }
    public static void checkDevice(int temperature1, int temperature2) {
        boolean isDeviceWorking = temperature1 > 100 && temperature2 < 100;
        System.out.println(isDeviceWorking);

    }


}



