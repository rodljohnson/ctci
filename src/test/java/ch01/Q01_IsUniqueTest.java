package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q01_IsUniqueTest {

    @Test
    public void isUniqueCharsTest() {
        assertTrue(Q01_IsUnique.isUniqueCharsA("abcde"));
        assertFalse(Q01_IsUnique.isUniqueCharsA("hello"));
        assertFalse(Q01_IsUnique.isUniqueCharsA("apple"));
        assertTrue(Q01_IsUnique.isUniqueCharsA("kite"));
        assertTrue(Q01_IsUnique.isUniqueCharsA("padle"));

        assertTrue(Q01_IsUnique.isUniqueCharsB("abcde"));
        assertFalse(Q01_IsUnique.isUniqueCharsB("hello"));
        assertFalse(Q01_IsUnique.isUniqueCharsB("apple"));
        assertTrue(Q01_IsUnique.isUniqueCharsB("kite"));
        assertTrue(Q01_IsUnique.isUniqueCharsB("padle"));
    }

}