package ch01.q4_palindrome_partition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePartitionTest {

    @Test
    public static void isPermutationOfPalindrome(String str) {
        assertTrue(PalindromePartition.isPermutationOfPalindrome("Tact Coa"));
        assertTrue(PalindromePartition.isPermutationOfPalindrome("jhsabckuj ahjsbckj"));
        assertFalse(PalindromePartition.isPermutationOfPalindrome("Able was I ere I saw Elb"));
        assertTrue(PalindromePartition.isPermutationOfPalindrome("So patient a nurse to nurse a patient s"));
        assertFalse(PalindromePartition.isPermutationOfPalindrome("Random Words"));
        assertFalse(PalindromePartition.isPermutationOfPalindrome("Not a Palindrome"));
        assertTrue(PalindromePartition.isPermutationOfPalindrome("no x in nixon"));
        assertTrue(PalindromePartition.isPermutationOfPalindrome("azAZ"));
    }
    
}