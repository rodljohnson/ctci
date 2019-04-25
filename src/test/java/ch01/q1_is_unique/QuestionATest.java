package ch01.q1_is_unique;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionATest {

    @Test
    public void isUniqueCharsTest() {
        assertTrue(QuestionA.isUniqueChars("abcde"));
        assertFalse(QuestionA.isUniqueChars("hello"));
        assertFalse(QuestionA.isUniqueChars("apple"));
        assertTrue(QuestionA.isUniqueChars("kite"));
        assertTrue(QuestionA.isUniqueChars("padle"));
    }

}