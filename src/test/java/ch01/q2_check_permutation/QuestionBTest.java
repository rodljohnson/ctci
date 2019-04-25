package ch01.q2_check_permutation;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuestionBTest {

    @Test
    public void permutationTest() {
        assertTrue(QuestionB.permutation("apple", "papel"));
        assertTrue(QuestionB.permutation("carrot", "tarroc"));
        assertTrue(QuestionB.permutation("hello", "llloh"));
    }

}