package ch01.q1_is_unique;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsUniqueTest {

    @Test
    public void isUniqueCharsTest() {
        assertTrue(IsUnique.isUniqueChars("abcde"));
        assertFalse(IsUnique.isUniqueChars("hello"));
        assertFalse(IsUnique.isUniqueChars("apple"));
        assertTrue(IsUnique.isUniqueChars("kite"));
        assertTrue(IsUnique.isUniqueChars("padle"));
    }

}