package ctci.ch01.q1_01_is_unique;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionBTest {

    @Test
    public void isUniqueCharsTest() {
        assertTrue(QuestionB.isUniqueChars("abcde"));
        assertTrue(QuestionB.isUniqueChars("hello"));
        assertTrue(QuestionB.isUniqueChars("apple"));
        assertTrue(QuestionB.isUniqueChars("kite"));
        assertTrue(QuestionB.isUniqueChars("padle"));
    }
}