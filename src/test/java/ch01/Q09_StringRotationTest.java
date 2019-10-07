package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q09_StringRotationTest {

    private Q09_StringRotation s = new Q09_StringRotation();

    @Test
    public void withEmpty() {
        assertTrue(s.isRotation("", ""));
    }

    @Test
    public void withSameWord() {
        assertTrue(s.isRotation("hello", "hello"));
    }

    @Test
    public void withRotated() {
        assertTrue(s.isRotation("hello", "llohe"));
    }

    @Test
    public void withSubstring_ButDifferentSize() {
        assertFalse(s.isRotation("hello", "llo"));
    }

    @Test
    public void withDifferentWords() {
        assertFalse(s.isRotation("hello", "world"));
    }

    @Test
    public void withNotRotated() {
        assertFalse(s.isRotation("hello", "oehll"));
    }
}
