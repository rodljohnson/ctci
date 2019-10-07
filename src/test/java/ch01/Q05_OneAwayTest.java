package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q05_OneAwayTest {

    private Q05_OneAway s = new Q05_OneAway();

    @Test
    public void withEmpty() {
        assertTrue(s.oneEditAway("", ""));
    }

    @Test
    public void withOneEmpty() {
        assertTrue(s.oneEditAway("", "b"));
    }

    @Test
    public void withTwoSingleWords() {
        assertTrue(s.oneEditAway("a", "b"));
    }

    @Test
    public void withOneInsertion() {
        assertTrue(s.oneEditAway("pae", "pale"));
    }

    @Test
    public void withOneDeletion() {
        assertTrue(s.oneEditAway("pales", "paes"));
    }

    @Test
    public void withOneReplace() {
        assertTrue(s.oneEditAway("pawe", "pave"));
    }

    @Test
    public void withMoreEdits() {
        assertFalse(s.oneEditAway("paxye", "pamne"));
    }
}
