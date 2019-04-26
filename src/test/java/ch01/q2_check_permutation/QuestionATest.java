package ch01.q2_check_permutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionATest {

    @Test
    public void permutationTest() {
        assertTrue(QuestionA.permutation("apple", "papel"));
        assertTrue(QuestionA.permutation("carrot", "tarroc"));
        assertFalse(QuestionA.permutation("hello", "llloh"));
    }

}