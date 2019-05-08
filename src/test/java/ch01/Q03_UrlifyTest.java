package ch01;

import org.junit.Test;
import util.AssortedMethods;

import static org.junit.Assert.*;

public class Q03_UrlifyTest {

    @Test
    public void replaceSpaces() {
        String str = "Mr John Smith    ";
        char[] arr = str.toCharArray();
        int trueLength = Q03_Urlify.findLastCharacter(arr) + 1;
        assertEquals("Mr%20John%20Smith", AssortedMethods.charArrayToString(Q03_Urlify.replaceSpaces(arr, trueLength)));
    }
}