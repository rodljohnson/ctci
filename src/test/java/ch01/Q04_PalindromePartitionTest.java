package ch01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q04_PalindromePartitionTest {

    @Test
    public void isPermutationOfPalindrome() {
        assertTrue(Q04_PalindromePartition.isPermutationOfPalindrome("Tact Coa"));
        assertTrue(Q04_PalindromePartition.isPermutationOfPalindrome("jhsabckuj ahjsbckj"));
        assertFalse(Q04_PalindromePartition.isPermutationOfPalindrome("Able was I ere I saw Elb"));
        assertTrue(Q04_PalindromePartition.isPermutationOfPalindrome("So patient a nurse to nurse a patient s"));
        assertFalse(Q04_PalindromePartition.isPermutationOfPalindrome("Random Words"));
        assertFalse(Q04_PalindromePartition.isPermutationOfPalindrome("Not a Palindrome"));
        assertTrue(Q04_PalindromePartition.isPermutationOfPalindrome("no x in nixon"));
        assertTrue(Q04_PalindromePartition.isPermutationOfPalindrome("azAZ"));
    }
    
}