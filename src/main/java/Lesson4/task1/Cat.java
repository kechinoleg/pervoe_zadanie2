package Lesson4.task1;

public class Cat {

    private int age;
    private String color;

    public Cat() {
        System.out.println("Вызван конструктор класса Cat");

    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public  Cat(String color) {

        this.color = color;

    }
}




