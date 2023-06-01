package Lesson5.homework5.home2;

public class schopTest {

    public static void main(String[] args) {

        boolean isEdekaOpen = false;
        boolean isReweOpen = true;

        System.out.println("Я могу купить еду: " + canBuy(isEdekaOpen, isReweOpen));
    }
    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }
}




