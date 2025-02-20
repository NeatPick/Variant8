package stringTest;

import main.VowelChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelCheckerTest {

    @Test
    void testProcessInputStartsWithVowel() {
        // Вводим строку
        String result = VowelChecker.processInput("язык джава");

        // Ожидаемый вывод
        String expectedOutput = "Слово начинается с гласной: язык\n" +
                "Слово не начинается с гласной буквы: джава\n";

        // Сравниваем результат
        assertEquals(expectedOutput, result);
    }

    @Test
    void testProcessInputNoWords() {
        // Вводим пустую строку
        String result = VowelChecker.processInput("");

        // Проверяем, что результат пустой
        Assertions.assertEquals("", result);
    }

    @Test
    void testIsVowel() {
        // Проверяем работу метода isVowel
        assertTrue(VowelChecker.isVowel('а'), "Буква а должна быть гласной");
        assertTrue(VowelChecker.isVowel('и'), "Буква и должна быть гласной");
        assertFalse(VowelChecker.isVowel('к'), "Буква к не является гласной");
    }
}
