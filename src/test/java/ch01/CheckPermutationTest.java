package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPermutationTest {

    @Test
    public void permutationTest() {
        assertTrue(CheckPermutation.permutation("apple", "papel"));
        assertTrue(CheckPermutation.permutation("carrot", "tarroc"));
        assertFalse(CheckPermutation.permutation("hello", "llloh"));
    }

}