package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q06_StringCompressionTest {

    @Test
    public void compressTest() {
        assertTrue(Q06_StringCompression.compress("aaaaabbbbaaaabbddc"));
    }
}