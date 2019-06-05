package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q02_CheckPermutationTest {

    @Test
    public void permutationTest() {
        assertTrue(Q02_CheckPermutation.permutationA("apple", "papel"));
        assertTrue(Q02_CheckPermutation.permutationA("carrot", "tarroc"));
        assertFalse(Q02_CheckPermutation.permutationA("hello", "llloh"));

        assertTrue(Q02_CheckPermutation.permutationB("apple", "papel"));
        assertTrue(Q02_CheckPermutation.permutationB("carrot", "tarroc"));
        assertFalse(Q02_CheckPermutation.permutationB("hello", "llloh"));
    }

}