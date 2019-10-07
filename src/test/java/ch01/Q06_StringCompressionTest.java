package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q06_StringCompressionTest {

    private Q06_StringCompression s = new Q06_StringCompression();

    @Test
    public void withOneSingleChar() {
        assertEquals("a", s.compress("a"));
    }

    @Test
    public void withTwoChars() {
        assertEquals("aa", s.compress("aa"));
    }

    @Test
    public void withThreeChars() {
        assertEquals("3a", s.compress("aaa"));
    }

    @Test
    public void withDifferentChars() {
        assertEquals("aaab", s.compress("aaab"));
    }

    @Test
    public void withDifferentChars_RepeatingSeveralTimes() {
        assertEquals("3a2b", s.compress("aaabb"));
    }

    @Test
    public void withDifferentChars_RepeatingInMoreSeqs() {
        assertEquals("3a2b2a", s.compress("aaabbaa"));
    }

}
