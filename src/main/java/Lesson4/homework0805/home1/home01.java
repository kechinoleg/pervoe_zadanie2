package Lesson4.homework0805.home1;

import java.util.Scanner;

public class home01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner("nemo lego");

        String firstWord = scanner.next();

        String secondWord = scanner.next();

        String firstHalf = firstWord.substring(0, firstWord.length() / 2);

        String secondHalf = secondWord.substring(secondWord.length() / 2);

        String newWord = firstHalf + secondHalf;

        System.out.println(newWord);

        scanner.close();




    }

}