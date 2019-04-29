package ch01.q3_urlify;

import util.AssortedMethods;

public class Urlify {

    // Assume string has sufficient free space at the end
    public static char[] replaceSpaces(char[] str, int trueLength) {
        throw new UnsupportedOperationException();
    }

    public static int findLastCharacter(char[] str) {
        for (int i = str.length - 1; i >= 0;i--) {
            if (str[i] != ' ') {
                return i;
            }
        }
        return -1;
    }

}
