package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q05_OneAwayTest {

    @Test
    public void oneEditAwayTest() {
        assertTrue(Q05_OneAway.oneEditAway("a", "b"));
        assertTrue(Q05_OneAway.oneEditAway("", "d"));
        assertTrue(Q05_OneAway.oneEditAway("d", "de"));
        assertFalse(Q05_OneAway.oneEditAway("pale", "pse"));
        assertTrue(Q05_OneAway.oneEditAway("acdsfdsfadsf", "acdsgdsfadsf"));
        assertTrue(Q05_OneAway.oneEditAway("acdsfdsfadsf", "acdsfdfadsf"));
        assertTrue(Q05_OneAway.oneEditAway("acdsfdsfadsf", "acdsfdsfads"));
        assertTrue(Q05_OneAway.oneEditAway("acdsfdsfadsf", "cdsfdsfadsf"));
        assertFalse(Q05_OneAway.oneEditAway("adfdsfadsf", "acdfdsfdsf"));
        assertFalse(Q05_OneAway.oneEditAway("adfdsfadsf", "bdfdsfadsg"));
        assertFalse(Q05_OneAway.oneEditAway("adfdsfadsf", "affdsfads"));
        assertTrue(Q05_OneAway.oneEditAway("pale", "pkle"));
        assertFalse(Q05_OneAway.oneEditAway("pkle", "pable"));
    }
}