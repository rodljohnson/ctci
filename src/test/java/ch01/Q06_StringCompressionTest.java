package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q06_StringCompressionTest {

    @Test
    public void compressTest() {
        assertEquals("a5b4a4b2d2c1", Q06_StringCompression.compress("aaaaabbbbaaaabbddc"));
        assertEquals("a2b1c5a3", Q06_StringCompression.compress("aabcccccaaa"));
        assertEquals("abcdef", Q06_StringCompression.compress("abcdef"));
    }
}