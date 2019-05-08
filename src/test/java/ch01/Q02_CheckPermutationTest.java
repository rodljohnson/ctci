package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q02_CheckPermutationTest {

    @Test
    public void permutationTest() {
        assertTrue(Q02_CheckPermutation.permutation("apple", "papel"));
        assertTrue(Q02_CheckPermutation.permutation("carrot", "tarroc"));
        assertFalse(Q02_CheckPermutation.permutation("hello", "llloh"));
    }

}