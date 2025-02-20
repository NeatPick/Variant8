package main;

import java.util.Scanner;

public class VowelChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        processInput(str);
    }

    public static String processInput(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split(" ");

        for (String word : words) {
            if (!word.isEmpty() && isVowel(word.charAt(0))) {
                result.append("Слово начинается с гласной: ").append(word).append("\n");
            } else if (!word.isEmpty()) {
                result.append("Слово не начинается с гласной буквы: ").append(word).append("\n");
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char letter) {
        char[] vowels = {'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я'};
        for (char vowel : vowels) {
            if (Character.toLowerCase(letter) == vowel) {
                return true;
            }
        }
        return false;
    }
}