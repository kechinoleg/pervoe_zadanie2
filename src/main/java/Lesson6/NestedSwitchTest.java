package Lesson6;

public class NestedSwitchTest {

    public static void main(String[] args) {

        String storageName = "Beta";
        int gateNumber = 2;

        switch (storageName) {
            case "Alfa":
                System.out.println("склад альфа");
                break;
            case "Beta":
                System.out.println("склад бэтта");
                switch (gateNumber) {
                    case 1:
                        System.out.println("Ворота 1");
                        break;
                    case 2:
                        System.out.println("Ворота2");
                        break;
                    case 3:
                        System.out.println("Ворота3");
                }
                break;
            case "Gamma":
                System.out.println("склад гамма");
                break;

        }
    }
}
