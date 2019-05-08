package ch01;

import ch01.IsUnique;
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