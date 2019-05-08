package ch01;

import ch01.Urlify;
import org.junit.Test;
import util.AssortedMethods;

import static org.junit.Assert.*;

public class UrlifyTest {

    @Test
    public void replaceSpaces() {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = Urlify.findLastCharacter(arr) + 1;
        assertEquals("Mr%20John%20Smith", AssortedMethods.charArrayToString(Urlify.replaceSpaces(arr, trueLength)));
    }
}