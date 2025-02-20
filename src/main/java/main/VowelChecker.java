package main;

import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        processInput(str);
    }

    public static void processInput(String input) {
        if (input == null || input.isEmpty()) {
            return;
        }

        String[] words = input.split("\\s+");
        for (String word : words) {
            if (isVowel(word.charAt(0))) {
                System.out.println("Слово начинается с гласной: " + word);
            } else {
                System.out.println("Слово не начинается с гласной буквы: " + word);
            }
        }
    }


    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return "аеёиоуыэюя".indexOf(c) != -1;
    }
}
