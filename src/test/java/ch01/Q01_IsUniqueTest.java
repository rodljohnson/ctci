package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q01_IsUniqueTest {

    private Q01_IsUnique s = new Q01_IsUnique();

    @Test
    public void withEmptyString() {
        assertTrue(s.isUniqueChars(""));
    }

    @Test
    public void withUniqueString() {
        assertTrue(s.isUniqueChars("abcde"));
    }

    @Test
    public void withDuplication() {
        assertFalse(s.isUniqueChars("abcda"));
    }

}
