package stringTest;
import main.VowelChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class VowelCheckerTest {

    @Test
    void testProcessInputStartsWithVowel() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        VowelChecker.processInput("Язык джава");
        String expectedOutput = "Слово начинается с гласной: Язык\n" +
                "Слово не начинается с гласной буквы: джава\n";

        String actualOutput = outputStream.toString();
        expectedOutput = expectedOutput.replaceAll("\\s+", " ").trim();
        actualOutput = actualOutput.replaceAll("\\s+", " ").trim();

        System.out.println("Expected Output: \n" + expectedOutput);
        System.out.println("Actual Output: \n" + actualOutput);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testProcessInputNoWords() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        VowelChecker.processInput("");
        Assertions.assertEquals("", outputStream.toString().replaceAll("\\s+", " "));
    }

    @Test
    void testIsVowel() {
        assertTrue(VowelChecker.isVowel('а'), "Буква а должна быть гласной");
        assertTrue(VowelChecker.isVowel('я'), "Буква и должна быть гласной");
        assertFalse(VowelChecker.isVowel('б'), "Буква к не является гласной");
    }
}
