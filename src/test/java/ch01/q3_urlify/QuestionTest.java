package ch01.q3_urlify;

import org.junit.Test;
import util.AssortedMethods;

import static org.junit.Assert.*;

public class QuestionTest {

    @Test
    public void replaceSpaces() {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = Question.findLastCharacter(arr) + 1;
        assertEquals("Mr%20John%20Smith", AssortedMethods.charArrayToString(Question.replaceSpaces(arr, trueLength)));
    }
}