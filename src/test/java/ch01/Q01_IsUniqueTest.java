package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q01_IsUniqueTest {

    @Test
    public void isUniqueCharsTest() {
        assertTrue(Q01_IsUnique.isUniqueChars("abcde"));
        assertFalse(Q01_IsUnique.isUniqueChars("hello"));
        assertFalse(Q01_IsUnique.isUniqueChars("apple"));
        assertTrue(Q01_IsUnique.isUniqueChars("kite"));
        assertTrue(Q01_IsUnique.isUniqueChars("padle"));
    }

}